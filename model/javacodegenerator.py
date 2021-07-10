
f = open("english.txt", "r",encoding="utf8")
xx = f.readlines()
f.close()

xxx= []

for x in xx:
    xxx.append(x[:-1])

f = open("hindi.txt", "r", encoding="utf8")
yy = f.readlines()
f.close()

yyy = []
for y in yy:
    yyy.append(y[:-1])


code = """else if(results.title.equals("{x}")){{
                                disease.text = "{y}"
                            }}"""

f = open("result,txt","a",encoding="utf8")
for x,y in zip(xxx,yyy):
    f.write(code.format(x=x,y=y))
f.close()