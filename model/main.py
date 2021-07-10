import cv2
im = cv2.imread("test_img.jpg")
x = str(im)


from selenium import webdriver
import win32com.client as comctl
from selenium.webdriver.common.keys import Keys
from webdriver_manager.chrome import ChromeDriverManager
import time
import clipboard


def encrypt(public_message, private_message):
    wsh = comctl.Dispatch("WScript.Shell")
    # ChromeDriverManager().install()
    opts = webdriver.ChromeOptions()
    opts.headless = False
    driver = webdriver.Chrome(executable_path=ChromeDriverManager().install(), options=opts)
    driver.get('https://neatnik.net/steganographr/')
    public = driver.find_element_by_xpath('//*[@id="public"]')
    public.send_keys(public_message)
    private = driver.find_element_by_xpath('//*[@id="private"]')
    private.send_keys(private_message)
    time.sleep(1)
    drive=driver.find_element_by_xpath("/html/body/main/form[1]/fieldset/p[4]/button")
    drive.click()
    time.sleep(2)
    elem = driver.find_element_by_xpath('/html/body/main/section/textarea')
    elem.send_keys("p")
    elem.send_keys(Keys.CONTROL, 'a') #highlight all in box
    elem.send_keys(Keys.CONTROL, 'c') #copy
    print("Text has been copied to clipboard")
    driver.close()

def decrypt(message):
    wsh = comctl.Dispatch("WScript.Shell")
    # ChromeDriverManager().install()
    opts = webdriver.ChromeOptions()
    opts.headless = False
    driver = webdriver.Chrome(executable_path=ChromeDriverManager().install(), options=opts)
    driver.get('https://neatnik.net/steganographr/')
    public = driver.find_element_by_xpath('//*[@id="encoded"]')
    public.send_keys(message)
    # private = driver.find_element_by_xpath('//*[@id="private"]')
    # private.send_keys(private_message)
    time.sleep(1)
    drive=driver.find_element_by_xpath("/html/body/main/form[2]/fieldset/p[3]/button")
    drive.click()
    time.sleep(2)
    elem = driver.find_element_by_xpath('/html/body/main/section/textarea')
    elem.send_keys("p")
    elem.send_keys(Keys.CONTROL, 'a') #highlight all in box
    elem.send_keys(Keys.CONTROL, 'c') #copy
    print("Text has been copied to clipboard")
    driver.close()


encrypt("Hi",x)
text = clipboard.paste()
print(text)
# decrypt(text)




