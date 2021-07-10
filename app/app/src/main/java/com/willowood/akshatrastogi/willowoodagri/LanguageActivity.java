package com.willowood.akshatrastogi.willowoodagri;


import android.app.NotificationManager;
import android.app.PendingIntent;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.BuildConfig;
import com.example.akshatrastogi.willowoodagri.R;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LanguageActivity extends AppCompatActivity {

    private FirebaseRemoteConfig mFirebaseRemoteConfig;


    NotificationCompat.Builder notification;
    private static final int uniqueID = 282002;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);


        final Button buttonenglish = (Button) findViewById(R.id.buttonenglish);
        buttonenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notification();
                Intent registerIntent = new Intent(LanguageActivity.this, EnglishHomepage.class);
                LanguageActivity.this.startActivity(registerIntent);
            }
        });


        final Button buttonhindi = (Button) findViewById(R.id.buttonhindi);
        buttonhindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationhindi();
                Intent registerIntent = new Intent(LanguageActivity.this, HindiHomepage.class);
                LanguageActivity.this.startActivity(registerIntent);
            }
        });


    }

    private void notificationhindi() {

        SharedPreferences pefs = getSharedPreferences("pefs", MODE_PRIVATE);
        boolean firstStart = pefs.getBoolean("frstStart", true);
        if (firstStart) {
            notification = new NotificationCompat.Builder(LanguageActivity.this);
            notification.setAutoCancel(true);
            notification.setSmallIcon(R.drawable.willowoodlogo);
            notification.setWhen(System.currentTimeMillis());
            notification.setContentTitle("धन्यवाद!");
            notification.setContentText("हमें खुशी है कि आपने हमारे ऐप को डाउनलोड किया");

            Intent intent = new Intent(LanguageActivity.this, LanguageActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(LanguageActivity.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            notification.setContentIntent(pendingIntent);

            NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            nm.notify(uniqueID, notification.build());

        }


        SharedPreferences.Editor editor = pefs.edit();
        editor.putBoolean("frstStart", false);
        editor.apply();


    }


    private void notification() {

        SharedPreferences pefs = getSharedPreferences("pefs", MODE_PRIVATE);
        boolean firstStart = pefs.getBoolean("frstStart", true);
        if (firstStart) {
            notification = new NotificationCompat.Builder(LanguageActivity.this);
            notification.setAutoCancel(true);
            notification.setSmallIcon(R.drawable.willowoodlogo);
            notification.setWhen(System.currentTimeMillis());
            notification.setContentTitle("Thank You!");
            notification.setContentText("We are glad you downloaded our app");

            Intent intent = new Intent(LanguageActivity.this, LanguageActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(LanguageActivity.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            notification.setContentIntent(pendingIntent);

            NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            nm.notify(uniqueID, notification.build());

        }


        SharedPreferences.Editor editor = pefs.edit();
        editor.putBoolean("frstStart", false);
        editor.apply();


    }

    public void onBackPressed() {
        moveTaskToBack(true);
        super.onBackPressed();
    }
}