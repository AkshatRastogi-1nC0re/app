package com.willowood.akshatrastogi.willowoodagri;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.akshatrastogi.willowoodagri.BuildConfig;
import com.example.akshatrastogi.willowoodagri.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class wwadvisor extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private FirebaseRemoteConfig mFirebaseRemoteConfig;

    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String eandhra1 = "english_andhra_crop_advisor_1";
    private static final String eandhra2 = "english_andhra_crop_advisor_2";
    private static final String eandhra3 = "english_andhra_crop_advisor_3";

    private static final String eandhrano1 = "english_andhra_crop_advisor_number_1";
    private static final String eandhrano2 = "english_andhra_crop_advisor_number_2";
    private static final String eandhrano3 = "english_andhra_crop_advisor_number_3";

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String earunachal1 = "english_arunachal_crop_advisor_1";
    private static final String earunachal2 = "english_arunachal_crop_advisor_2";
    private static final String earunachal3 = "english_arunachal_crop_advisor_3";

    private static final String earunachalno1 = "english_arunachal_crop_advisor_number_1";
    private static final String earunachalno2 = "english_arunachal_crop_advisor_number_2";
    private static final String earunachalno3 = "english_arunachal_crop_advisor_number_3";

    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String eassam1 = "english_assam_crop_advisor_1";
    private static final String eassam2 = "english_assam_crop_advisor_2";
    private static final String eassam3 = "english_assam_crop_advisor_3";

    private static final String eassamno1 = "english_assam_crop_advisor_number_1";
    private static final String eassamno2 = "english_assam_crop_advisor_number_2";
    private static final String eassamno3 = "english_assam_crop_advisor_number_3";

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String ebihar1 = "english_bihar_crop_advisor_1";
    private static final String ebihar2 = "english_bihar_crop_advisor_2";
    private static final String ebihar3 = "english_bihar_crop_advisor_3";

    private static final String ebiharno1 = "english_bihar_crop_advisor_number_1";
    private static final String ebiharno2 = "english_bihar_crop_advisor_number_2";
    private static final String ebiharno3 = "english_bihar_crop_advisor_number_3";

    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String echattisgarh1 = "english_chattisgarh_crop_advisor_1";
    private static final String echattisgarh2 = "english_chattisgarh_crop_advisor_2";
    private static final String echattisgarh3 = "english_chattisgarh_crop_advisor_3";

    private static final String echattisgarhno1 = "english_chattisgarh_crop_advisor_number_1";
    private static final String echattisgarhno2 = "english_chattisgarh_crop_advisor_number_2";
    private static final String echattisgarhno3 = "english_chattisgarh_crop_advisor_number_3";

    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String egoa1 = "english_goa_crop_advisor_1";
    private static final String egoa2 = "english_goa_crop_advisor_2";
    private static final String egoa3 = "english_goa_crop_advisor_3";

    private static final String egoano1 = "english_goa_crop_advisor_number_1";
    private static final String egoano2 = "english_goa_crop_advisor_number_2";
    private static final String egoano3 = "english_goa_crop_advisor_number_3";

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String egujarat1 = "english_gujarat_crop_advisor_1";
    private static final String egujarat2 = "english_gujarat_crop_advisor_2";
    private static final String egujarat3 = "english_gujarat_crop_advisor_3";

    private static final String egujaratno1 = "english_gujarat_crop_advisor_number_1";
    private static final String egujaratno2 = "english_gujarat_crop_advisor_number_2";
    private static final String egujaratno3 = "english_gujarat_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String eharyana1 = "english_haryana_crop_advisor_1";
    private static final String eharyana2 = "english_haryana_crop_advisor_2";
    private static final String eharyana3 = "english_haryana_crop_advisor_3";

    private static final String eharyanano1 = "english_haryana_crop_advisor_number_1";
    private static final String eharyanano2 = "english_haryana_crop_advisor_number_2";
    private static final String eharyanano3 = "english_haryana_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String ehimachal1 = "english_himachal_crop_advisor_1";
    private static final String ehimachal2 = "english_himachal_crop_advisor_2";
    private static final String ehimachal3 = "english_himachal_crop_advisor_3";
                                                                                                    //Himachal
    private static final String ehimachalno1 = "english_himachal_crop_advisor_number_1";
    private static final String ehimachalno2 = "english_himachal_crop_advisor_number_2";
    private static final String ehimachalno3 = "english_himachal_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String ejammu1 = "english_jammu_crop_advisor_1";
    private static final String ejammu2 = "english_jammu_crop_advisor_2";
    private static final String ejammu3 = "english_jammu_crop_advisor_3";
                                                                                                    //Jammu and Kashmir
    private static final String ejammuno1 = "english_jammu_crop_advisor_number_1";
    private static final String ejammuno2 = "english_jammu_crop_advisor_number_2";
    private static final String ejammuno3 = "english_jammu_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String ejharkhand1 = "english_jharkhand_crop_advisor_1";
    private static final String ejharkhand2 = "english_jharkhand_crop_advisor_2";
    private static final String ejharkhand3 = "english_jharkhand_crop_advisor_3";
    //Jharkhand
    private static final String ejharkhandno1 = "english_jharkhand_crop_advisor_number_1";
    private static final String ejharkhandno2 = "english_jharkhand_crop_advisor_number_2";
    private static final String ejharkhandno3 = "english_jharkhand_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String ekarnataka1 = "english_karnataka_crop_advisor_1";
    private static final String ekarnataka2 = "english_karnataka_crop_advisor_2";
    private static final String ekarnataka3 = "english_karnataka_crop_advisor_3";
    //Jharkhand
    private static final String ekarnatakano1 = "english_karnataka_crop_advisor_number_1";
    private static final String ekarnatakano2 = "english_karnataka_crop_advisor_number_2";
    private static final String ekarnatakano3 = "english_karnataka_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String ekerela1 = "english_kerela_crop_advisor_1";
    private static final String ekerela2 = "english_kerela_crop_advisor_2";
    private static final String ekerela3 = "english_kerela_crop_advisor_3";
    //Jharkhand
    private static final String ekerelano1 = "english_kerela_crop_advisor_number_1";
    private static final String ekerelano2 = "english_kerela_crop_advisor_number_2";
    private static final String ekerelano3 = "english_kerela_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String emp1 = "english_mp_crop_advisor_1";
    private static final String emp2 = "english_mp_crop_advisor_2";
    private static final String emp3 = "english_mp_crop_advisor_3";
    //Jharkhand
    private static final String empno1 = "english_mp_crop_advisor_number_1";
    private static final String empno2 = "english_mp_crop_advisor_number_2";
    private static final String empno3 = "english_mp_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String emaharashtra1 = "english_maharashtra_crop_advisor_1";
    private static final String emaharashtra2 = "english_maharashtra_crop_advisor_2";
    private static final String emaharashtra3 = "english_maharashtra_crop_advisor_3";
    //maharashtra
    private static final String emaharashtrano1 = "english_maharashtra_crop_advisor_number_1";
    private static final String emaharashtrano2 = "english_maharashtra_crop_advisor_number_2";
    private static final String emaharashtrano3 = "english_maharashtra_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String emanipur1 = "english_manipur_crop_advisor_1";
    private static final String emanipur2 = "english_manipur_crop_advisor_2";
    private static final String emanipur3 = "english_manipur_crop_advisor_3";
    //Jharkhand
    private static final String emanipurno1 = "english_manipur_crop_advisor_number_1";
    private static final String emanipurno2 = "english_manipur_crop_advisor_number_2";
    private static final String emanipurno3 = "english_manipur_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String emeghalaya1 = "english_meghalaya_crop_advisor_1";
    private static final String emeghalaya2 = "english_meghalaya_crop_advisor_2";
    private static final String emeghalaya3 = "english_meghalaya_crop_advisor_3";
    //Jharkhand
    private static final String emeghalayano1 = "english_meghalaya_crop_advisor_number_1";
    private static final String emeghalayano2 = "english_meghalaya_crop_advisor_number_2";
    private static final String emeghalayano3 = "english_meghalaya_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String emizoram1 = "english_mizoram_crop_advisor_1";
    private static final String emizoram2 = "english_mizoram_crop_advisor_2";
    private static final String emizoram3 = "english_mizoram_crop_advisor_3";
    //Jharkhand
    private static final String emizoramno1 = "english_mizoram_crop_advisor_number_1";
    private static final String emizoramno2 = "english_mizoram_crop_advisor_number_2";
    private static final String emizoramno3 = "english_mizoram_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String enagaland1 = "english_nagaland_crop_advisor_1";
    private static final String enagaland2 = "english_nagaland_crop_advisor_2";
    private static final String enagaland3 = "english_nagaland_crop_advisor_3";
                                                                                                    //Nagaland
    private static final String enagalandno1 = "english_nagaland_crop_advisor_number_1";
    private static final String enagalandno2 = "english_nagaland_crop_advisor_number_2";
    private static final String enagalandno3 = "english_nagaland_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String eorissa1 = "english_orissa_crop_advisor_1";
    private static final String eorissa2 = "english_orissa_crop_advisor_2";
    private static final String eorissa3 = "english_orissa_crop_advisor_3";
    //Nagaland
    private static final String eorissano1 = "english_orissa_crop_advisor_number_1";
    private static final String eorissano2 = "english_orissa_crop_advisor_number_2";
    private static final String eorissano3 = "english_orissa_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String epunjab1 = "english_punjab_crop_advisor_1";
    private static final String epunjab2 = "english_punjab_crop_advisor_2";
    private static final String epunjab3 = "english_punjab_crop_advisor_3";
    //Nagaland
    private static final String epunjabno1 = "english_punjab_crop_advisor_number_1";
    private static final String epunjabno2 = "english_punjab_crop_advisor_number_2";
    private static final String epunjabno3 = "english_punjab_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String erajasthan1 = "english_rajasthan_crop_advisor_1";
    private static final String erajasthan2 = "english_rajasthan_crop_advisor_2";
    private static final String erajasthan3 = "english_rajasthan_crop_advisor_3";
    //Nagaland
    private static final String erajasthanno1 = "english_rajasthan_crop_advisor_number_1";
    private static final String erajasthanno2 = "english_rajasthan_crop_advisor_number_2";
    private static final String erajasthanno3 = "english_rajasthan_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String esikkim1 = "english_sikkim_crop_advisor_1";
    private static final String esikkim2 = "english_sikkim_crop_advisor_2";
    private static final String esikkim3 = "english_sikkim_crop_advisor_3";
    //Nagaland
    private static final String esikkimno1 = "english_sikkim_crop_advisor_number_1";
    private static final String esikkimno2 = "english_sikkim_crop_advisor_number_2";
    private static final String esikkimno3 = "english_sikkim_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String etamilnadu1 = "english_tamilnadu_crop_advisor_1";
    private static final String etamilnadu2 = "english_tamilnadu_crop_advisor_2";
    private static final String etamilnadu3 = "english_tamilnadu_crop_advisor_3";
    //tamilnadu
    private static final String etamilnaduno1 = "english_tamilnadu_crop_advisor_number_1";
    private static final String etamilnaduno2 = "english_tamilnadu_crop_advisor_number_2";
    private static final String etamilnaduno3 = "english_tamilnadu_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String etripura1 = "english_tripura_crop_advisor_1";
    private static final String etripura2 = "english_tripura_crop_advisor_2";
    private static final String etripura3 = "english_tripura_crop_advisor_3";
    //Nagaland
    private static final String etripurano1 = "english_tripura_crop_advisor_number_1";
    private static final String etripurano2 = "english_tripura_crop_advisor_number_2";
    private static final String etripurano3 = "english_tripura_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String euttrakhand1 = "english_uttrakhand_crop_advisor_1";
    private static final String euttrakhand2 = "english_uttrakhand_crop_advisor_2";
    private static final String euttrakhand3 = "english_uttrakhand_crop_advisor_3";
    //Nagaland
    private static final String euttrakhandno1 = "english_uttrakhand_crop_advisor_number_1";
    private static final String euttrakhandno2 = "english_uttrakhand_crop_advisor_number_2";
    private static final String euttrakhandno3 = "english_uttrakhand_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String eup1 = "english_up_crop_advisor_1";
    private static final String eup2 = "english_up_crop_advisor_2";
    private static final String eup3 = "english_up_crop_advisor_3";
    //Nagaland
    private static final String eupno1 = "english_up_crop_advisor_number_1";
    private static final String eupno2 = "english_up_crop_advisor_number_2";
    private static final String eupno3 = "english_up_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String ewb1 = "english_wb_crop_advisor_1";
    private static final String ewb2 = "english_wb_crop_advisor_2";
    private static final String ewb3 = "english_wb_crop_advisor_3";
    //Nagaland
    private static final String ewbno1 = "english_wb_crop_advisor_number_1";
    private static final String ewbno2 = "english_wb_crop_advisor_number_2";
    private static final String ewbno3 = "english_wb_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String echandigarh1 = "english_chandigarh_crop_advisor_1";
    private static final String echandigarh2 = "english_chandigarh_crop_advisor_2";
    private static final String echandigarh3 = "english_chandigarh_crop_advisor_3";
    //Nagaland
    private static final String echandigarhno1 = "english_chandigarh_crop_advisor_number_1";
    private static final String echandigarhno2 = "english_chandigarh_crop_advisor_number_2";
    private static final String echandigarhno3 = "english_chandigarh_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String edelhi1 = "english_delhi_crop_advisor_1";
    private static final String edelhi2 = "english_delhi_crop_advisor_2";
    private static final String edelhi3 = "english_delhi_crop_advisor_3";
    //Nagaland
    private static final String edelhino1 = "english_delhi_crop_advisor_number_1";
    private static final String edelhino2 = "english_delhi_crop_advisor_number_2";
    private static final String edelhino3 = "english_delhi_crop_advisor_number_3";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wwadvisor);

        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build();
        mFirebaseRemoteConfig.setConfigSettings(configSettings);

        final ProgressDialog pd = new ProgressDialog(wwadvisor.this);

        // Set progress dialog style spinner
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        // Set the progress dialog title and message
        pd.setTitle("");
        pd.setMessage("Loading Your State Advisors.....");

        // Set the progress dialog background color
        pd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#038C11")));

        pd.setIndeterminate(true);

        // Finally, show the progress dialog
        pd.show();


        mFirebaseRemoteConfig.setDefaults(R.xml.remote_config_defaults);

        long cacheExpiration = 3600;

        if (mFirebaseRemoteConfig.getInfo().getConfigSettings().isDeveloperModeEnabled()) {

            cacheExpiration = 0;

        }

        final TextView cropadvisor1 = (TextView) findViewById(R.id.tv1);
        final TextView cropadvisor2 = (TextView) findViewById(R.id.tv2);
        final TextView cropadvisor3 = (TextView) findViewById(R.id.tv3);

        TextView st = (TextView) findViewById(R.id.statename);

        SharedPreferences namedata = getApplicationContext().getSharedPreferences("ND", 0);
        st.setText(namedata.getString("user_state", null));
        if (namedata.getString("user_state", null) == "Andhra Pradesh") {
            st.setText("Andhra Pradesh");
        } else if (namedata.getString("user_state", null) == "Arunachal Pradesh") {
            st.setText("Arunachal Pradesh");
        } else if (namedata.getString("user_state", null) == "Assam") {
            st.setText("Assam");
        } else if (namedata.getString("user_state", null) == "Bihar") {
            st.setText("Bihar");
        } else if (namedata.getString("user_state", null) == "Chhattisgarh") {
            st.setText("Chhattisgarh");
        } else if (namedata.getString("user_state", null) == "Goa") {
            st.setText("Goa");
        } else if (namedata.getString("user_state", null) == "Gujarat") {
            st.setText("Gujarat");
        } else if (namedata.getString("user_state", null) == "Haryana") {
            st.setText("Haryana");
        } else if (namedata.getString("user_state", null) == "Himachal Pradesh") {
            st.setText("Himachal Pradesh");
        } else if (namedata.getString("user_state", null) == "Jammu and Kashmir") {
            st.setText("Jammu and Kashmir");
        } else if (namedata.getString("user_state", null) == "Jharkhand") {
            st.setText("Jharkhand");
        } else if (namedata.getString("user_state", null) == "Karnataka") {
            st.setText("Karnataka");
        } else if (namedata.getString("user_state", null) == "Kerala") {
            st.setText("Kerala");
        } else if (namedata.getString("user_state", null) == "Madhya Pradesh") {
            st.setText("Madhya Pradesh");
        } else if (namedata.getString("user_state", null) == "Maharashtra") {
            st.setText("Maharashtra");
        } else if (namedata.getString("user_state", null) == "Manipur") {
            st.setText("Manipur");
        } else if (namedata.getString("user_state", null) == "Meghalaya") {
            st.setText("Meghalaya");
        } else if (namedata.getString("user_state", null) == "Mizoram") {
            st.setText("Mizoram");
        } else if (namedata.getString("user_state", null) == "Nagaland") {
            st.setText("Nagaland");
        } else if (namedata.getString("user_state", null) == "Orissa") {
            st.setText("Orissa");
        } else if (namedata.getString("user_state", null) == "Punjab") {
            st.setText("Punjab");
        } else if (namedata.getString("user_state", null) == "Rajasthan") {
            st.setText("Rajasthan");
        } else if (namedata.getString("user_state", null) == "Sikkim") {
            st.setText("Sikkim");
        } else if (namedata.getString("user_state", null) == "Tamil Nadu") {
            st.setText("Tamil Nadu");
        } else if (namedata.getString("user_state", null) == "Tripura") {
            st.setText("Tripura");
        } else if (namedata.getString("user_state", null) == "Uttarakhand") {
            st.setText("Uttarakhand");
        } else if (namedata.getString("user_state", null) == "Uttar Pradesh") {
            st.setText("Uttar Pradesh");
        } else if (namedata.getString("user_state", null) == "West Bengal") {
            st.setText("West Bengal");
        } else if (namedata.getString("user_state", null) == "Chandigarh") {
            st.setText("Chandigarh");
        } else if (namedata.getString("user_state", null) == "Delhi") {
            st.setText("Delhi");
        }

        String stateuser = st.getText().toString();

        if (namedata.getString("user_state", null) == "") {
            SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
            cropadvisor1.setText(advisorenglish.getString("c1", null));
            cropadvisor2.setText(advisorenglish.getString("c2", null));
            cropadvisor3.setText(advisorenglish.getString("c3", null));
        } else {

            if (stateuser.equals("")) {
                cropadvisor1.setText("No one can reach this point");
            } else if (stateuser.equals("Andhra Pradesh")) {

                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                                    @Override

                                    public void onComplete(Task<Void> task) {

                                        if (task.isSuccessful()) {

                                            // task successful. Activate the fetched data

                                            pd.dismiss();

                                            mFirebaseRemoteConfig.activateFetched();

                                            final String Sai = mFirebaseRemoteConfig.getString(eandhra1);
                                            final String Sai2 = mFirebaseRemoteConfig.getString(eandhra2);
                                            final String Sai3 = mFirebaseRemoteConfig.getString(eandhra3);

                                            final String Saino = mFirebaseRemoteConfig.getString(eandhrano1);
                                            final String Saino2 = mFirebaseRemoteConfig.getString(eandhrano2);
                                            final String Saino3 = mFirebaseRemoteConfig.getString(eandhrano3);

                                            if(Sai.isEmpty()){

                                                cropadvisor1.setText("");
                                            }else{
                                                cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                            }

                                            if(Sai2.isEmpty()){
                                                cropadvisor2.setText("");
                                            }else{
                                                cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                            }

                                            if(Sai3.isEmpty()){
                                                cropadvisor3.setText("");
                                            }else{
                                                cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                            }
                                            //update views?
                                            SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                            SharedPreferences.Editor editor = advisorenglish.edit();
                                            editor.putString("c1", cropadvisor1.getText().toString());
                                            editor.putString("c2", cropadvisor2.getText().toString());
                                            editor.putString("c3", cropadvisor3.getText().toString());
                                            editor.apply();
                                            cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                            cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                            cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                            cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                            android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                        ActivityCompat.requestPermissions(wwadvisor.this,
                                                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                                    } else {

                                                        String dial = "tel:" + Saino;
                                                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                                    }
                                                }
                                            });

                                            cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                            android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                        ActivityCompat.requestPermissions(wwadvisor.this,
                                                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                                    } else {
                                                        String dial = "tel:" + Saino2;
                                                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                                    }
                                                }
                                            });

                                            cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                            android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                        ActivityCompat.requestPermissions(wwadvisor.this,
                                                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                                    } else {
                                                        String dial = "tel:" + Saino3;
                                                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                                    }
                                                }
                                            });


                                        }
                                        else{

                                            Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                            startActivity(intent);

                                        }
                                    }
                                });

                ////////////////////////////////////////////////////////////////////////////////////

            } else if (stateuser.equals("Arunachal Pradesh")) {mFirebaseRemoteConfig.fetch(cacheExpiration)

                    .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                        @Override

                        public void onComplete(Task<Void> task) {

                            if (task.isSuccessful()) {

                                // task successful. Activate the fetched data

                                pd.dismiss();

                                mFirebaseRemoteConfig.activateFetched();

                                final String Sai = mFirebaseRemoteConfig.getString(earunachal1);
                                final String Sai2 = mFirebaseRemoteConfig.getString(earunachal2);
                                final String Sai3 = mFirebaseRemoteConfig.getString(earunachal3);

                                final String Saino = mFirebaseRemoteConfig.getString(earunachalno1);
                                final String Saino2 = mFirebaseRemoteConfig.getString(earunachalno2);
                                final String Saino3 = mFirebaseRemoteConfig.getString(earunachalno3);

                                if(Sai.isEmpty()){

                                    cropadvisor1.setText("");
                                }else{
                                    cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                }

                                if(Sai2.isEmpty()){
                                    cropadvisor2.setText("");
                                }else{
                                    cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                }

                                if(Sai3.isEmpty()){
                                    cropadvisor3.setText("");
                                }else{
                                    cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                }
                                //update views?
                                SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                SharedPreferences.Editor editor = advisorenglish.edit();
                                editor.putString("c1", cropadvisor1.getText().toString());
                                editor.putString("c2", cropadvisor2.getText().toString());
                                editor.putString("c3", cropadvisor3.getText().toString());
                                editor.apply();
                                cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                            ActivityCompat.requestPermissions(wwadvisor.this,
                                                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                        } else {

                                            String dial = "tel:" + Saino;
                                            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                        }
                                    }
                                });

                                cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                            ActivityCompat.requestPermissions(wwadvisor.this,
                                                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                        } else {
                                            String dial = "tel:" + Saino2;
                                            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                        }
                                    }
                                });

                                cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                            ActivityCompat.requestPermissions(wwadvisor.this,
                                                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                        } else {
                                            String dial = "tel:" + Saino3;
                                            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                        }
                                    }
                                });


                            }
                            else{

                                Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                startActivity(intent);

                            }
                        }
                    });


            } else if (stateuser.equals("Assam")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(eassam1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(eassam2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(eassam3);

                                    final String Saino = mFirebaseRemoteConfig.getString(eassamno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(eassamno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(eassamno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });
            } else if (stateuser.equals("Bihar")) {mFirebaseRemoteConfig.fetch(cacheExpiration)

                    .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                        @Override

                        public void onComplete(Task<Void> task) {

                            if (task.isSuccessful()) {

                                // task successful. Activate the fetched data

                                pd.dismiss();

                                mFirebaseRemoteConfig.activateFetched();

                                final String Sai = mFirebaseRemoteConfig.getString(ebihar1);
                                final String Sai2 = mFirebaseRemoteConfig.getString(ebihar2);
                                final String Sai3 = mFirebaseRemoteConfig.getString(ebihar3);

                                final String Saino = mFirebaseRemoteConfig.getString(ebiharno1);
                                final String Saino2 = mFirebaseRemoteConfig.getString(ebiharno2);
                                final String Saino3 = mFirebaseRemoteConfig.getString(ebiharno3);

                                if(Sai .isEmpty()){

                                    cropadvisor1.setText("");
                                }else{
                                    cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                }

                                if(Sai2 .isEmpty()){
                                    cropadvisor2.setText("");
                                }else{
                                    cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                }

                                if(Sai3 .isEmpty()){
                                    cropadvisor3.setText("");
                                }else{
                                    cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                }
                                //update views?
                                SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                SharedPreferences.Editor editor = advisorenglish.edit();
                                editor.putString("c1", cropadvisor1.getText().toString());
                                editor.putString("c2", cropadvisor2.getText().toString());
                                editor.putString("c3", cropadvisor3.getText().toString());
                                editor.apply();
                                cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                            ActivityCompat.requestPermissions(wwadvisor.this,
                                                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                        } else {

                                            String dial = "tel:" + Saino;
                                            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                        }
                                    }
                                });

                                cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                            ActivityCompat.requestPermissions(wwadvisor.this,
                                                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                        } else {
                                            String dial = "tel:" + Saino2;
                                            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                        }
                                    }
                                });

                                cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                            ActivityCompat.requestPermissions(wwadvisor.this,
                                                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                        } else {
                                            String dial = "tel:" + Saino3;
                                            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                        }
                                    }
                                });


                            }
                            else{

                                Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                startActivity(intent);

                            }
                        }
                    });

            } else if (stateuser.equals("Chhattisgarh")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(echattisgarh1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(echattisgarh2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(echattisgarh3);

                                    final String Saino = mFirebaseRemoteConfig.getString(echattisgarhno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(echattisgarhno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(echattisgarhno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Goa")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(egoa1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(egoa2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(egoa3);

                                    final String Saino = mFirebaseRemoteConfig.getString(egoano1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(egoano2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(egoano3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });
            } else if (stateuser.equals("Gujarat")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(egujarat1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(egujarat2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(egujarat3);

                                    final String Saino = mFirebaseRemoteConfig.getString(egujaratno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(egujaratno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(egujaratno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });
            } else if (stateuser.equals("Haryana")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(eharyana1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(eharyana2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(eharyana3);

                                    final String Saino = mFirebaseRemoteConfig.getString(eharyanano1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(eharyanano2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(eharyanano3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });
            } else if (stateuser.equals("Himachal Pradesh")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(ehimachal1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(ehimachal2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(ehimachal3);

                                    final String Saino = mFirebaseRemoteConfig.getString(ehimachalno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(ehimachalno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(ehimachalno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });
            } else if (stateuser.equals("Jammu and Kashmir")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(ejammu1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(ejammu2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(ejammu3);

                                    final String Saino = mFirebaseRemoteConfig.getString(ejammuno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(ejammuno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(ejammuno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });
            } else if (stateuser.equals("Jharkhand")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(ejharkhand1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(ejharkhand2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(ejharkhand3);

                                    final String Saino = mFirebaseRemoteConfig.getString(ejharkhandno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(ejharkhandno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(ejharkhandno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });
            } else if (stateuser.equals("Karnataka")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(ekarnataka1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(ekarnataka2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(ekarnataka3);

                                    final String Saino = mFirebaseRemoteConfig.getString(ekarnatakano1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(ekarnatakano2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(ekarnatakano3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });
            } else if (stateuser.equals("Kerala")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(ekerela1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(ekerela2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(ekerela3);

                                    final String Saino = mFirebaseRemoteConfig.getString(ekerelano1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(ekerelano2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(ekerelano3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Madhya Pradesh")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(emp1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(emp2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(emp3);

                                    final String Saino = mFirebaseRemoteConfig.getString(empno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(empno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(empno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Maharashtra")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(emaharashtra1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(emaharashtra2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(emaharashtra3);

                                    final String Saino = mFirebaseRemoteConfig.getString(emaharashtrano1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(emaharashtrano2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(emaharashtrano3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Manipur")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(emanipur1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(emanipur2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(emanipur3);

                                    final String Saino = mFirebaseRemoteConfig.getString(emanipurno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(emanipurno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(emanipurno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Meghalaya")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(emeghalaya1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(emeghalaya2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(emeghalaya3);

                                    final String Saino = mFirebaseRemoteConfig.getString(emeghalayano1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(emeghalayano2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(emeghalayano3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Mizoram")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(emizoram1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(emizoram2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(emizoram3);

                                    final String Saino = mFirebaseRemoteConfig.getString(emizoramno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(emizoramno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(emizoramno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Nagaland")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(enagaland1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(enagaland2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(enagaland3);

                                    final String Saino = mFirebaseRemoteConfig.getString(enagalandno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(enagalandno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(enagalandno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Orissa")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(eorissa1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(eorissa2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(eorissa3);

                                    final String Saino = mFirebaseRemoteConfig.getString(eorissano1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(eorissano2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(eorissano3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Punjab")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(epunjab1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(epunjab2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(epunjab3);

                                    final String Saino = mFirebaseRemoteConfig.getString(epunjabno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(epunjabno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(epunjabno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Rajasthan")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(erajasthan1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(erajasthan2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(erajasthan3);

                                    final String Saino = mFirebaseRemoteConfig.getString(erajasthanno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(erajasthanno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(erajasthanno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Sikkim")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(esikkim1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(esikkim2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(esikkim3);

                                    final String Saino = mFirebaseRemoteConfig.getString(esikkimno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(esikkimno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(esikkimno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Tamil Nadu")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(etamilnadu1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(etamilnadu2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(etamilnadu3);

                                    final String Saino = mFirebaseRemoteConfig.getString(etamilnaduno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(etamilnaduno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(etamilnaduno3);

                                    if(Sai .isEmpty()){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 .isEmpty()){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 .isEmpty()){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Tripura")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(etripura1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(etripura2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(etripura3);

                                    final String Saino = mFirebaseRemoteConfig.getString(etripurano1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(etripurano2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(etripurano3);

                                    if(Sai == ""){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 == ""){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 == ""){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Uttarakhand")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(euttrakhand1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(euttrakhand2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(euttrakhand3);

                                    final String Saino = mFirebaseRemoteConfig.getString(euttrakhandno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(euttrakhandno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(euttrakhandno3);

                                    if(Sai == ""){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 == ""){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 == ""){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Uttar Pradesh")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(eup1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(eup2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(eup3);

                                    final String Saino = mFirebaseRemoteConfig.getString(eupno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(eupno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(eupno3);

                                    if(Sai == ""){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 == ""){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 == ""){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("West Bengal")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(ewb1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(ewb2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(ewb3);

                                    final String Saino = mFirebaseRemoteConfig.getString(ewbno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(ewbno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(ewbno3);

                                    if(Sai == ""){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 == ""){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 == ""){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Chandigarh")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(echandigarh1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(echandigarh2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(echandigarh3);

                                    final String Saino = mFirebaseRemoteConfig.getString(echandigarhno1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(echandigarhno2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(echandigarhno3);

                                    if(Sai == ""){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 == ""){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 == ""){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            } else if (stateuser.equals("Delhi")) {
                mFirebaseRemoteConfig.fetch(cacheExpiration)

                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                            @Override

                            public void onComplete(Task<Void> task) {

                                if (task.isSuccessful()) {

                                    // task successful. Activate the fetched data

                                    pd.dismiss();

                                    mFirebaseRemoteConfig.activateFetched();

                                    final String Sai = mFirebaseRemoteConfig.getString(edelhi1);
                                    final String Sai2 = mFirebaseRemoteConfig.getString(edelhi2);
                                    final String Sai3 = mFirebaseRemoteConfig.getString(edelhi3);

                                    final String Saino = mFirebaseRemoteConfig.getString(edelhino1);
                                    final String Saino2 = mFirebaseRemoteConfig.getString(edelhino2);
                                    final String Saino3 = mFirebaseRemoteConfig.getString(edelhino3);

                                    if(Sai == ""){

                                        cropadvisor1.setText("");
                                    }else{
                                        cropadvisor1.setText("ADVISOR:" + Sai +  "\n" + "PHONE NO.:" + Saino);
                                    }

                                    if(Sai2 == ""){
                                        cropadvisor2.setText("");
                                    }else{
                                        cropadvisor2.setText("ADVISOR:" + Sai2 + "\n" + "PHONE NO.:" + Saino2);
                                    }

                                    if(Sai3 == ""){
                                        cropadvisor3.setText("");
                                    }else{
                                        cropadvisor3.setText("ADVISOR:" + Sai3 + "\n" + "PHONE NO.:" + Saino3);
                                    }
                                    //update views?
                                    SharedPreferences advisorenglish = getApplicationContext().getSharedPreferences("advisorenglish", 0);
                                    SharedPreferences.Editor editor = advisorenglish.edit();
                                    editor.putString("c1", cropadvisor1.getText().toString());
                                    editor.putString("c2", cropadvisor2.getText().toString());
                                    editor.putString("c3", cropadvisor3.getText().toString());
                                    editor.apply();
                                    cropadvisor1.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor2.setBackgroundColor(Color.parseColor("#038C11"));
                                    cropadvisor3.setBackgroundColor(Color.parseColor("#038C11"));

                                    cropadvisor1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {

                                                String dial = "tel:" + Saino;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino2;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });

                                    cropadvisor3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (ContextCompat.checkSelfPermission(wwadvisor.this,
                                                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions(wwadvisor.this,
                                                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                String dial = "tel:" + Saino3;
                                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                                            }
                                        }
                                    });


                                }
                                else{

                                    Toast.makeText(getApplicationContext(),"LOAD FAILED!! CONNECT TO THE INTERNET",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(wwadvisor.this, EnglishHomepage.class);
                                    startActivity(intent);

                                }
                            }
                        });

            }
        }
    }

}

