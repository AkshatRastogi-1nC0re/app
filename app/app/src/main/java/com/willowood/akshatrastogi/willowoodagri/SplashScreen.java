package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.akshatrastogi.willowoodagri.R;


public class SplashScreen extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final ImageView zoom = (ImageView) findViewById(R.id.logo);
        final Animation zoomAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        zoom.startAnimation(zoomAnimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences prefs = getSharedPreferences("prefs", 0);
                boolean agreed = prefs.getBoolean("agreed", false);
                if (!agreed) {
                    Intent registerIntent = new Intent(SplashScreen.this, termsandconditions.class);
                    registerIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    SplashScreen.this.startActivity(registerIntent);
                    showTermsandConditions();
                } else {
                    Intent registerIntent = new Intent(SplashScreen.this, LanguageActivity.class);
                    SplashScreen.this.startActivity(registerIntent);
                }
            }
        }, SPLASH_TIME_OUT);

    }

    private void showTermsandConditions() {

    }




}

