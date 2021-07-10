package com.willowood.akshatrastogi.willowoodagri;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class contactus extends AppCompatActivity {

    private static final int REQUEST_CALL =1;
    public static String FACEBOOK_URL = "https://www.facebook.com/willowood.india";
    public static String FACEBOOK_PAGE_ID = "Willowood India";

    public static String LINKEDIN_URL = "https://www.linkedin.com/company/willowood";
    public static String LINKEDIN_PAGE_ID = "Willowood";

    public static String YOUTUBE_URL = "https://www.youtube.com/channel/UCGBkxUMfbr63dgBP3kepVCQ";
    public static String YOUTUBE_PAGE_ID = "UCGBkxUMfbr63dgBP3kepVCQ";

    public static String TWITTER_URL = "https://www.twitter.com/IndiaWillowood";
    public static String TWITTER_PAGE_ID = "@IndiaWilowood";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        final Button twitter = (Button) findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent twitterIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getTwitterPage(contactus.this);
                twitterIntent.setData(Uri.parse(facebookUrl));
                startActivity(twitterIntent);
            }
        });

        final Button Youtube = (Button) findViewById(R.id.youtube);
        Youtube.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent yi = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getYoutube(contactus.this);
                yi.setData(Uri.parse(facebookUrl));
                startActivity(yi);
            }
        });

        final Button facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(contactus.this);
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);
            }
        });

        final Button link = (Button) findViewById(R.id.linkedin);
        link.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent li = new Intent(Intent.ACTION_VIEW);
                String linkedinURL = getLinkedinPageURL(contactus.this);
                li.setData(Uri.parse(linkedinURL));
                startActivity(li);
            }
        });


        Button startBtn = (Button) findViewById(R.id.emailbutton);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendEmail();
            }
        });

        final Button call = (Button) findViewById(R.id.callbutton);
        call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                makePhoneCall();

            }
        });
    }
    public String getLinkedinPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.linkedin.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return  LINKEDIN_URL;
            } else { //older versions of fb app
                return "linkedin://profile/" + LINKEDIN_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return LINKEDIN_URL; //normal web url
        }
    }
    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }

    public String getTwitterPage(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.twitter.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "twitter://user?screen_name=" + TWITTER_URL;
            } else { //older versions of fb app
                return "https://twitter.com/#!/" + TWITTER_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return TWITTER_URL; //normal web url
        }
    }

    public String getYoutube(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.youtube.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "youtube://user?screen_name=" + YOUTUBE_URL;
            } else { //older versions of fb app
                return "https://youtube.com/#!/" + YOUTUBE_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return YOUTUBE_URL; //normal web url
        }
    }


    private void makePhoneCall(){
        if (ContextCompat.checkSelfPermission(contactus.this,
                android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(contactus.this,
                    new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
        }else {
            String dial = "tel:01146592912";
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                makePhoneCall();
            }else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }

    protected void sendEmail() {

        Button startBtn = (Button) findViewById(R.id.emailbutton);
        Log.v("TO:", String.valueOf(startBtn));
        String email = "care@willowood.com";
        Uri uri = Uri.parse("mailto:" + email);

        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        startActivity(intent);

    }

}
