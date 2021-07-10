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

class mainactivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_plant_english)
        mClassifier = Classifier(assets, mModelPath, mLabelPath, mInputSize)

        val tv1: TextView = findViewById(R.id.imagedes)
        val disease: TextView = findViewById(R.id.disease)
        val conf: TextView = findViewById(R.id.conf)
        val lay1: LinearLayout = findViewById(R.id.lay1)
        val lay2: LinearLayout = findViewById(R.id.lay2)
        val lay3: LinearLayout = findViewById(R.id.lay3)

        val btn_again = findViewById<View>(R.id.takeanotherpic) as Button
        btn_again.setOnClickListener {
            val registerIntent = Intent(this@mainactivity, mainactivity::class.java)
            this@mainactivity.startActivity(registerIntent)
        }

        val btn_get_solution = findViewById<View>(R.id.getsolution) as Button
        btn_get_solution.setOnClickListener {
            val registerIntent = Intent(this@mainactivity, mainactivity::class.java)
            this@mainactivity.startActivity(registerIntent)
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
                            disease.text = results.title
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
        val registerIntent = Intent(this@mainactivity, EnglishHomepage::class.java)
        this@mainactivity.startActivity(registerIntent)
        super.onBackPressed()
    }

}

