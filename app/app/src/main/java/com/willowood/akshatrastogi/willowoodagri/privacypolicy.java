package com.willowood.akshatrastogi.willowoodagri;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.BuildConfig;
import com.example.akshatrastogi.willowoodagri.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class privacypolicy extends AppCompatActivity {

    private FirebaseRemoteConfig mFirebaseRemoteConfig;
    private static final String p1 = "privacy_policy_p1";
    private static final String p2t = "privacy_policy_p2_title";
    private static final String p2 = "privacy_policy_p2";
    private static final String p3 = "privacy_policy_p3";
    private static final String p4t = "privacy_policy_p4_title";
    private static final String p4 = "privacy_policy_p4";
    private static final String p5t = "privacy_policy_p5_title";
    private static final String p5 = "privacy_policy_p5";
    private static final String p6t = "privacy_policy_p6_title";
    private static final String p6 = "privacy_policy_p6";
    private static final String p7t = "privacy_policy_p7_title";
    private static final String p7 = "privacy_policy_p7";
    private static final String p8t = "privacy_policy_p8_title";
    private static final String p8 = "privacy_policy_p8";
    private static final String p9 = "privacy_policy_p9";
    private static final String p10 = "privacy_policy_p10";
    private static final String p11 = "privacy_policy_p11";
    private static final String p12 = "privacy_policy_p12";
    private static final String p13 = "privacy_policy_p13";
    private static final String p14 = "privacy_policy_p14";
    private static final String p15 = "privacy_policy_p15";
    private static final String p16 = "privacy_policy_p16";

    private TextView Pcp1, Pcp2t, Pcp2, Pcp3, Pcp4t, Pcp4, Pcp5t, Pcp5, Pcp6t, Pcp6, Pcp7t, Pcp7, Pcp8t, Pcp8, Pcp9, Pcp10 ,Pcp11 , Pcp12 , Pcp13 , Pcp14 , Pcp15 , Pcp16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacypolicy);
        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build();
        mFirebaseRemoteConfig.setConfigSettings(configSettings);

        mFirebaseRemoteConfig.setDefaults(R.xml.remote_config_defaults);

        final ProgressDialog pd = new ProgressDialog(privacypolicy.this);

        // Set progress dialog style spinner
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        // Set the progress dialog title and message
        pd.setTitle("");
        pd.setMessage("Loading Content Please Wait...");

        // Set the progress dialog background color
        pd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4a89c2")));

        pd.setIndeterminate(true);

        // Finally, show the progress dialog
        pd.show();

        long cacheExpiration = 3600;

        if (mFirebaseRemoteConfig.getInfo().getConfigSettings().isDeveloperModeEnabled()) {

            cacheExpiration = 0;

        }

        mFirebaseRemoteConfig.fetch(cacheExpiration)

                .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                    @Override

                    public void onComplete(Task<Void> task) {

                        if (task.isSuccessful()) {
                            pd.dismiss();

                            // task successful. Activate the fetched data

                            mFirebaseRemoteConfig.activateFetched();

                            //update views?
                            Pcp1 = findViewById(R.id.para1pp);
                            Pcp2t = findViewById(R.id.para2tpp);
                            Pcp2 = findViewById(R.id.para2pp);
                            Pcp3 = findViewById(R.id.para3pp);
                            Pcp4t = findViewById(R.id.para4tpp);
                            Pcp4 = findViewById(R.id.para4pp);
                            Pcp5t = findViewById(R.id.para5tpp);
                            Pcp5 = findViewById(R.id.para5pp);
                            Pcp6t = findViewById(R.id.para6tpp);
                            Pcp6 = findViewById(R.id.para6pp);
                            Pcp7t = findViewById(R.id.para7tpp);
                            Pcp7 = findViewById(R.id.para7pp);
                            Pcp8t = findViewById(R.id.para8tpp);
                            Pcp8 = findViewById(R.id.para8pp);
                            Pcp9 = findViewById(R.id.para9pp);
                            Pcp10 = findViewById(R.id.para10pp);
                            Pcp11 = findViewById(R.id.para11pp);
                            Pcp12 = findViewById(R.id.para12pp);
                            Pcp13 = findViewById(R.id.para13pp);
                            Pcp14 = findViewById(R.id.para14pp);
                            Pcp15 = findViewById(R.id.para15pp);
                            Pcp16 = findViewById(R.id.para16pp);

                            Pcp1.setText(mFirebaseRemoteConfig.getString(p1));
                            Pcp2t.setText(mFirebaseRemoteConfig.getString(p2t));
                            Pcp2.setText(mFirebaseRemoteConfig.getString(p2));
                            Pcp3.setText(mFirebaseRemoteConfig.getString(p3));
                            Pcp4t.setText(mFirebaseRemoteConfig.getString(p4t));
                            Pcp4.setText(mFirebaseRemoteConfig.getString(p4));
                            Pcp5t.setText(mFirebaseRemoteConfig.getString(p5t));
                            Pcp5.setText(mFirebaseRemoteConfig.getString(p5));
                            Pcp6t.setText(mFirebaseRemoteConfig.getString(p6t));

                            Pcp6.setText(mFirebaseRemoteConfig.getString(p6));
                            Pcp7t.setText(mFirebaseRemoteConfig.getString(p7t));
                            Pcp7.setText(mFirebaseRemoteConfig.getString(p7));
                            Pcp8t.setText(mFirebaseRemoteConfig.getString(p8t));
                            Pcp8.setText(mFirebaseRemoteConfig.getString(p8));
                            Pcp9.setText(mFirebaseRemoteConfig.getString(p9));
                            Pcp10.setText(mFirebaseRemoteConfig.getString(p10));
                            Pcp11.setText(mFirebaseRemoteConfig.getString(p11));
                            Pcp12.setText(mFirebaseRemoteConfig.getString(p12));
                            Pcp13.setText(mFirebaseRemoteConfig.getString(p13));
                            Pcp14.setText(mFirebaseRemoteConfig.getString(p14));
                            Pcp15.setText(mFirebaseRemoteConfig.getString(p15));
                            Pcp16.setText(mFirebaseRemoteConfig.getString(p16));

                        } else {

                            Toast.makeText(getApplicationContext(), "LOAD FAILED!! CONNECT TO THE INTERNET", Toast.LENGTH_SHORT).show();

                        }

                    }

                });

    }
    public void onBackPressed() {
        Intent registerIntent = new Intent(privacypolicy.this, termsandconditions.class);
        privacypolicy.this.startActivity(registerIntent);
        super.onBackPressed();
    }
}

