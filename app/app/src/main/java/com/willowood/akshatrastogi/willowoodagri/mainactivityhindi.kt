package com.willowood.akshatrastogi.willowoodagri;

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.akshatrastogi.willowoodagri.R
import kotlinx.android.synthetic.main.activity_plant_english.*
import java.io.IOException
import java.sql.DriverManager.println

class mainactivityhindi : AppCompatActivity() {
    private lateinit var mClassifier: Classifier
    private lateinit var mBitmap: Bitmap

    private val mCameraRequestCode = 0
    private val mGalleryRequestCode = 2

    private val mInputSize = 224
    private val mModelPath = "plant_disease_model.tflite"
    private val mLabelPath = "plant_labels.txt"
    private val mSamplePath = "soybean.JPG"


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setContentView(R.layout.activity_plant_hindi)
        mClassifier = Classifier(assets, mModelPath, mLabelPath, mInputSize)

        val tv1: TextView = findViewById(R.id.imagedes)
        val disease: TextView = findViewById(R.id.disease)
        val conf: TextView = findViewById(R.id.conf)
        val lay1: LinearLayout = findViewById(R.id.lay1)
        val lay2: LinearLayout = findViewById(R.id.lay2)
        val lay3: LinearLayout = findViewById(R.id.lay3)

        val btn_again = findViewById<View>(R.id.takeanotherpic) as Button
        btn_again.setOnClickListener {
            val registerIntent = Intent(this@mainactivityhindi, mainactivityhindi::class.java)
            this@mainactivityhindi.startActivity(registerIntent)
        }

        val btn_get_solution = findViewById<View>(R.id.getsolution) as Button
        btn_get_solution.setOnClickListener {
            val registerIntent = Intent(this@mainactivityhindi, mainactivityhindi::class.java)
            this@mainactivityhindi.startActivity(registerIntent)
        }


        resources.assets.open(mSamplePath).use {
            mBitmap = BitmapFactory.decodeStream(it)
            mBitmap = Bitmap.createScaledBitmap(mBitmap, mInputSize, mInputSize, true)
            mPhotoImageView.setImageBitmap(mBitmap)
        }

        mCameraButton.setOnClickListener {
            val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            tv1.text = "Test Image"
            startActivityForResult(callCameraIntent, mCameraRequestCode)

        }

        mGalleryButton.setOnClickListener {
            val callGalleryIntent = Intent(Intent.ACTION_PICK)
            callGalleryIntent.type = "image/*"
            startActivityForResult(callGalleryIntent, mGalleryRequestCode)
            tv1.text = "Test Image"
        }
        mDetectButton.setOnClickListener {
                val results = mClassifier.recognizeImage(mBitmap).firstOrNull()
                mResultTextView.text= results?.title+"\n Confidence:"+results?.confidence
            var x = results?.confidence
            if (x != null) {
                if(x<=0.8){
                    val toast = Toast.makeText(this, ("Cannot Identify Disease"), Toast.LENGTH_LONG)
                    toast.setGravity(Gravity.BOTTOM, 0, 20)
                    toast.show()
                }
                else{
                    lay1.visibility = View.GONE
                    if (results != null) {
                        if(results.title.contains("healthy", ignoreCase = true)){
                            lay3.visibility = View.VISIBLE
                        }
                        else{
                            lay2.visibility = View.VISIBLE
                            if(results.title.equals("apple apple scab")){
                                disease.text = "सेब की पपड़ी"
                            }else if(results.title.equals("apple black rot")){
                                disease.text = "सेब काला सड़ांध"
                            }else if(results.title.equals("apple cedar apple rust")){
                                disease.text = "सेब देवदार सेब जंग"
                            }else if(results.title.equals("apple healthy")){
                                disease.text = "सेब स्वस्थ"
                            }else if(results.title.equals("blueberry healthy")){
                                disease.text = "ब्लूबेरी स्वस्थ"
                            }else if(results.title.equals("cherry including sour powdery mildew")){
                                disease.text = "खट्टा पाउडर फफूंदी सहित चेरी"
                            }else if(results.title.equals("cherry including sour healthy")){
                                disease.text = "चेरी सहित खट्टा स्वस्थ"
                            }else if(results.title.equals("corn maize cercospora leaf spot gray leaf spot")){
                                disease.text = "मकई मक्का सर्कोस्पोरा लीफ स्पॉट ग्रे लीफ स्पॉट"
                            }else if(results.title.equals("corn maize common rust")){
                                disease.text = "मक्का मक्का आम जंग"
                            }else if(results.title.equals("corn maize northern leaf blight")){
                                disease.text = "मक्का मक्का उत्तरी पत्ती तुषार"
                            }else if(results.title.equals("corn maize healthy")){
                                disease.text = "मक्का मक्का स्वस्थ"
                            }else if(results.title.equals("grape black rot")){
                                disease.text = "अंगूर काला सड़ांध"
                            }else if(results.title.equals("grape esca black measles")){
                                disease.text = "अंगूर काला खसरा"
                            }else if(results.title.equals("grape leaf blight isariopsis leaf spot")){
                                disease.text = "अंगूर का पत्ता तुड़ाई इसारियोप्सिस लीफ स्पॉट"
                            }else if(results.title.equals("grape healthy")){
                                disease.text = "अंगूर स्वस्थ"
                            }else if(results.title.equals("orange haunglongbing citrus greening")){
                                disease.text = "संतरा हैंगलोंगबिंग साइट्रस ग्रीनिंग"
                            }else if(results.title.equals("peach bacterial spot")){
                                disease.text = "पीच बैक्टीरियल स्पॉट"
                            }else if(results.title.equals("peach healthy")){
                                disease.text = "आड़ू स्वस्थ"
                            }else if(results.title.equals("pepper bell bacterial spot")){
                                disease.text = "काली मिर्च की घंटी जीवाणु स्पॉट"
                            }else if(results.title.equals("pepper bell healthy")){
                                disease.text = "काली मिर्च की घंटी स्वस्थ"
                            }else if(results.title.equals("potato early blight")){
                                disease.text = "आलू जल्दी तुषार"
                            }else if(results.title.equals("potato late blight")){
                                disease.text = "आलू लेट ब्लाइट"
                            }else if(results.title.equals("potato healthy")){
                                disease.text = "आलू स्वस्थ"
                            }else if(results.title.equals("raspberry healthy")){
                                disease.text = "रास्पबेरी स्वस्थ"
                            }else if(results.title.equals("soybean healthy")){
                                disease.text = "सोयाबीन स्वस्थ"
                            }else if(results.title.equals("squash powdery mildew")){
                                disease.text = "स्क्वैश पाउडर फफूंदी"
                            }else if(results.title.equals("strawberry leaf scorch")){
                                disease.text = "स्ट्रॉबेरी लीफ स्कॉर्च"
                            }else if(results.title.equals("strawberry healthy")){
                                disease.text = "स्ट्रॉबेरी स्वस्थ"
                            }else if(results.title.equals("tomato bacterial spot")){
                                disease.text = "टमाटर जीवाणु स्पॉट"
                            }else if(results.title.equals("tomato early blight")){
                                disease.text = "टमाटर जल्दी तुड़ाई"
                            }else if(results.title.equals("tomato late blight")){
                                disease.text = "टमाटर देर से तुड़ाई"
                            }else if(results.title.equals("tomato leaf mold")){
                                disease.text = "टमाटर का पत्ता मोल्ड"
                            }else if(results.title.equals("tomato septoria leaf spot")){
                                disease.text = "टमाटर सेप्टोरिया लीफ स्पॉट"
                            }else if(results.title.equals("tomato spider mites two spotted spider mite")){
                                disease.text = "टोमैटो स्पाइडर माइट्स टू स्पॉटेड स्पाइडर माइट"
                            }else if(results.title.equals("tomato target spot")){
                                disease.text = "टमाटर लक्ष्य स्थान"
                            }else if(results.title.equals("tomato tomato yellow leaf curl virus")){
                                disease.text = "टमाटर टमाटर पीली पत्ती कर्ल वायरस"
                            }else if(results.title.equals("tomato tomato mosaic virus")){
                                disease.text = "टमाटर टमाटर मोज़ेक वायरस"
                            }else if(results.title.equals("tomato healthy")){
                                disease.text = "टमाटर स्वस्"
                            }else{
                                disease.text = "No result found"
                            }
                            conf.text = "" + results.confidence
                        }
                    }

                    val toast = Toast.makeText(this, (results?.title + "\n Confidence:" + results?.confidence), Toast.LENGTH_LONG)
                    toast.setGravity(Gravity.BOTTOM, 0, 20)
                    toast.show()
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == mCameraRequestCode){
            //Considérons le cas de la caméra annulée
            if(resultCode == Activity.RESULT_OK && data != null) {
                mBitmap = data.extras!!.get("data") as Bitmap
                mBitmap = scaleImage(mBitmap)
                val toast = Toast.makeText(this, ("Image crop to: w= ${mBitmap.width} h= ${mBitmap.height}"), Toast.LENGTH_LONG)
                toast.setGravity(Gravity.BOTTOM, 0, 20)
                toast.show()
                mPhotoImageView.setImageBitmap(mBitmap)
                mResultTextView.text= "Your photo image set now."
            } else {
                Toast.makeText(this, "Camera cancel..", Toast.LENGTH_LONG).show()
            }
        } else if(requestCode == mGalleryRequestCode) {
            if (data != null) {
                val uri = data.data

                try {
                    mBitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)
                } catch (e: IOException) {
                    e.printStackTrace()
                }

                println("Success!!!")
                mBitmap = scaleImage(mBitmap)
                mPhotoImageView.setImageBitmap(mBitmap)

            }
        } else {
            Toast.makeText(this, "Unrecognized request code", Toast.LENGTH_LONG).show()

        }
    }


    fun scaleImage(bitmap: Bitmap?): Bitmap {
        val orignalWidth = bitmap!!.width
        val originalHeight = bitmap.height
        val scaleWidth = mInputSize.toFloat() / orignalWidth
        val scaleHeight = mInputSize.toFloat() / originalHeight
        val matrix = Matrix()
        matrix.postScale(scaleWidth, scaleHeight)
        return Bitmap.createBitmap(bitmap, 0, 0, orignalWidth, originalHeight, matrix, true)
    }

    public fun <T> List<T>.firstOrNull(): T? {
        return if (isEmpty()) null else this[0]
    }

    override fun onBackPressed() {
        val registerIntent = Intent(this@mainactivityhindi, HindiHomepage::class.java)
        this@mainactivityhindi.startActivity(registerIntent)
        super.onBackPressed()
    }

}

