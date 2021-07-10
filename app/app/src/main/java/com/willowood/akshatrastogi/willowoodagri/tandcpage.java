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

public class tandcpage extends AppCompatActivity {

    private FirebaseRemoteConfig mFirebaseRemoteConfig;
    private static final String Terms_conditions = "terms_conditions_p1";
    private static final String t2t = "terms_conditions_p2_title";
    private static final String t2 = "terms_conditions_p2";
    private static final String t3t = "terms_conditions_p3_title";
    private static final String t3 = "terms_conditions_p3";
    private static final String t4t = "terms_conditions_p4_title";
    private static final String t4 = "terms_conditions_p4";
    private static final String t5t = "terms_conditions_p5_title";
    private static final String t5 = "terms_conditions_p5";
    private static final String t6t = "terms_conditions_p6_title";
    private static final String t6 = "terms_conditions_p6";
    private static final String t7t = "terms_conditions_p7_title";
    private static final String t7 = "terms_conditions_p7";
    private static final String t8t = "terms_conditions_p8_title";
    private static final String t8 = "terms_conditions_p8";
    private static final String t9t = "terms_conditions_p9_title";
    private static final String t9 = "terms_conditions_p9";
    private static final String t10t = "terms_conditions_p10_title";
    private static final String t10 = "terms_conditions_p10";
    private TextView Tcp1,Tcp2t,Tcp2,Tcp3t,Tcp3,Tcp4t,Tcp4,Tcp5t,Tcp5,Tcp6t,Tcp6,Tcp7t,Tcp7,Tcp8t,Tcp8,Tcp9t,Tcp9,Tcp10t,Tcp10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tandcpage);

        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build();
        mFirebaseRemoteConfig.setConfigSettings(configSettings);

        mFirebaseRemoteConfig.setDefaults(R.xml.remote_config_defaults);

        final ProgressDialog pd = new ProgressDialog(tandcpage.this);

        // Set progress dialog style spinner
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        // Set the progress dialog title and message
        pd.setTitle("");
        pd.setMessage("Loading Content Please Wait...");

        // Set the progress dialog background color
        pd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#038C11")));

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
                            Tcp1 = findViewById(R.id.para1tandc);
                            Tcp2t = findViewById(R.id.para2ttandc);
                            Tcp2 = findViewById(R.id.para2tandc);
                            Tcp3t = findViewById(R.id.para3ttandc);
                            Tcp3 = findViewById(R.id.para3tandc);
                            Tcp4t = findViewById(R.id.para4ttandc);
                            Tcp4 = findViewById(R.id.para4tandc);
                            Tcp5t = findViewById(R.id.para5ttandc);
                            Tcp5 = findViewById(R.id.para5tandc);
                            Tcp6t = findViewById(R.id.para6ttandc);
                            Tcp6 = findViewById(R.id.para6tandc);
                            Tcp7t = findViewById(R.id.para7ttandc);
                            Tcp7 = findViewById(R.id.para7tandc);
                            Tcp8t = findViewById(R.id.para8ttandc);
                            Tcp8 = findViewById(R.id.para8tandc);
                            Tcp9t = findViewById(R.id.para9ttandc);
                            Tcp9 = findViewById(R.id.para9tandc);
                            Tcp10t = findViewById(R.id.para10ttandc);
                            Tcp10 = findViewById(R.id.para10tandc);

                            Tcp1.setText(mFirebaseRemoteConfig.getString(Terms_conditions));
                            Tcp2t.setText(mFirebaseRemoteConfig.getString(t2t));
                            Tcp2.setText(mFirebaseRemoteConfig.getString(t2));
                            Tcp3t.setText(mFirebaseRemoteConfig.getString(t3t));
                            Tcp3.setText(mFirebaseRemoteConfig.getString(t3));
                            Tcp4t.setText(mFirebaseRemoteConfig.getString(t4t));
                            Tcp4.setText(mFirebaseRemoteConfig.getString(t4));
                            Tcp5t.setText(mFirebaseRemoteConfig.getString(t5t));
                            Tcp5.setText(mFirebaseRemoteConfig.getString(t5));

                            Tcp6t.setText(mFirebaseRemoteConfig.getString(t6t));
                            Tcp6.setText(mFirebaseRemoteConfig.getString(t6));
                            Tcp7t.setText(mFirebaseRemoteConfig.getString(t7t));
                            Tcp7.setText(mFirebaseRemoteConfig.getString(t7));
                            Tcp8t.setText(mFirebaseRemoteConfig.getString(t8t));
                            Tcp8.setText(mFirebaseRemoteConfig.getString(t8));
                            Tcp9t.setText(mFirebaseRemoteConfig.getString(t9t));
                            Tcp9.setText(mFirebaseRemoteConfig.getString(t9));
                            Tcp10t.setText(mFirebaseRemoteConfig.getString(t10t));
                            Tcp10.setText(mFirebaseRemoteConfig.getString(t10));



                        } else {

                            Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();


                        }

                    }

                });

                    }
    public void onBackPressed() {
        Intent registerIntent = new Intent(tandcpage.this, termsandconditions.class);
        tandcpage.this.startActivity(registerIntent);
        super.onBackPressed();
    }

}


