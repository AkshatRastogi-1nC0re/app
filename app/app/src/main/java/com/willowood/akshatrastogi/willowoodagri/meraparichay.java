package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class meraparichay extends AppCompatActivity {

    private EditText n1, f1,p1,po1,t1,d1,pn1,l1, mcg,pc1;
    private Button buttonsave , inv;
    SharedPreferences.Editor editor;
    private DatabaseReference databaseReference;
    SharedPreferences info;
    public String id ;
    boolean connected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meraparichay);

        final TextView statecrop = (TextView) findViewById(R.id.stt);
        final TextView occupationtext = (TextView) findViewById(R.id.oc);
        SharedPreferences registeredonce = getSharedPreferences("registeredonce", 0);
        boolean abhiabhiaaya = registeredonce.getBoolean("registeredonce", true);
        SharedPreferences namedata = getApplicationContext().getSharedPreferences("ND", 0);
        if(abhiabhiaaya){

        Spinner state = (Spinner) findViewById(R.id.sp);
        Spinner occupation = (Spinner) findViewById(R.id.occu);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(meraparichay.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Statehindi));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(myAdapter);

        state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){

                }else if (i == 1){
                    statecrop.setText("Andhra Pradesh");
                }else if (i == 2){
                    statecrop.setText("Arunachal Pradesh");
                }else if (i == 3){
                    statecrop.setText("Assam");
                }else if (i == 4){
                    statecrop.setText("Bihar");
                }else if (i == 5){
                    statecrop.setText("Chhattisgarh");
                }else if (i == 6){
                    statecrop.setText("Goa");
                } else if (i == 7){
                    statecrop.setText("Gujarat");
                } else if (i == 8){
                    statecrop.setText("Haryana");
                }else if (i == 9){
                    statecrop.setText("Himachal Pradesh");
                }else if (i == 10){
                    statecrop.setText("Jammu and Kashmir");
                }else if (i == 11){
                    statecrop.setText("Jharkhand");
                }else if (i == 12){
                    statecrop.setText("Karnataka");
                }else if (i == 13){
                    statecrop.setText("Kerala");
                }else if (i == 14){
                    statecrop.setText("Madhya Pradesh");
                }else if (i == 15){
                    statecrop.setText("Maharashtra");
                }else if (i == 16){
                    statecrop.setText("Manipur");
                }else if (i == 17){
                    statecrop.setText("Meghalaya");
                }else if (i == 18){
                    statecrop.setText("Mizoram");
                }else if (i == 19){
                    statecrop.setText("Nagaland");
                }else if (i == 20){
                    statecrop.setText("Orissa");
                }else if (i == 21){
                    statecrop.setText("Punjab");
                }else if (i == 22){
                    statecrop.setText("Rajasthan");
                }else if (i == 23){
                    statecrop.setText("Sikkim");
                }else if (i == 24){
                    statecrop.setText("Tamil Nadu");
                }else if (i == 25){
                    statecrop.setText("Tripura");
                }else if (i == 26){
                    statecrop.setText("Uttarakhand");
                }else if (i == 27){
                    statecrop.setText("Uttar Pradesh");
                }else if (i == 28){
                    statecrop.setText("West Bengal");
                }else if (i == 29){
                    statecrop.setText("Chandigarh");
                }else if (i == 30){
                    statecrop.setText("Delhi");
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<String> occupationadapter = new ArrayAdapter<String>(meraparichay.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Occupationhindi));
        occupationadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        occupation.setAdapter(occupationadapter);

        occupation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){

                }else if (i == 1){
                    occupationtext.setText("Farmer");
                }else if (i == 2){
                    occupationtext.setText("WW Employee");
                }else if (i == 3){
                    occupationtext.setText("Employee (Other)");
                }else if (i == 4){
                    occupationtext.setText("Scientist");
                }else if (i == 5){
                    occupationtext.setText("Student");
                }else if (i == 6){
                    occupationtext.setText("Dealer/Distributer");
                } else if (i == 7){
                    occupationtext.setText("Any Other");
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        info = getSharedPreferences("Registration", 0);
        editor = info.edit();


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);




        databaseReference = FirebaseDatabase.getInstance().getReference();
        n1 = (EditText)findViewById(R.id.name);
        f1 = (EditText)findViewById(R.id.fathersname);
        p1 = (EditText)findViewById(R.id.villageortown);

        po1 = (EditText)findViewById(R.id.postoffice);
        t1 = (EditText)findViewById(R.id.tehsil);
        d1 = (EditText)findViewById(R.id.district);

        pn1 = (EditText)findViewById(R.id.pno);
        l1 = (EditText)findViewById(R.id.area);
        d1 = (EditText)findViewById(R.id.district);
        pc1 = (EditText)findViewById(R.id.pincode);

        mcg = (EditText)findViewById(R.id.maj);

        inv = (Button) findViewById(R.id.invisible);
        inv.setOnClickListener(new View.OnClickListener(){
            boolean i = true;
            @Override
            public void onClick(View view) {
                if(i == true){
                    inv.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.t1, 0);
                    f1.setVisibility(View.VISIBLE);
                    p1.setVisibility(View.VISIBLE);
                    po1.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    pc1.setVisibility(View.VISIBLE);
                    d1.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    mcg.setVisibility(View.VISIBLE);

                    i = false;
                }else{
                    inv.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.t2, 0);
                    f1.setVisibility(View.GONE);
                    p1.setVisibility(View.GONE);
                    po1.setVisibility(View.GONE);
                    pc1.setVisibility(View.GONE);
                    t1.setVisibility(View.GONE);
                    d1.setVisibility(View.GONE);
                    l1.setVisibility(View.GONE);
                    mcg.setVisibility(View.GONE);

                    i = true;
                }



            }
        });


        buttonsave = (Button) findViewById(R.id.buttonsubmit);


        buttonsave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String State = statecrop.getText().toString();
                String Occupation = occupationtext.getText().toString();

                String Name = n1.getText().toString();
                String Fathername = f1.getText().toString();
                String PostOffice = po1.getText().toString();
                String Tehsil = t1.getText().toString();
                String District = d1.getText().toString();
                String LandOwned = l1.getText().toString();
                String VillageOrTown = p1.getText().toString();
                String ContactNumber = pn1.getText().toString();

                if (Name.isEmpty() || Name.length() < 3 || Name.length() > 20){
                    Toast.makeText(getApplicationContext(),"अपना नाम दर्ज करें",Toast.LENGTH_SHORT).show();

                }else if (State.isEmpty()){
                    Toast.makeText(getApplicationContext(),"राज्य चुनें!!",Toast.LENGTH_SHORT).show();
                }
                else if (Occupation.isEmpty()){
                    Toast.makeText(getApplicationContext(),"व्यवसाय का चयन करें!!",Toast.LENGTH_SHORT).show();
                }
                else if (ContactNumber.isEmpty() || ContactNumber.length() < 10){
                    Toast.makeText(getApplicationContext(),"एक वैध फोन नंबर दर्ज करें!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent registerIntent = new Intent(meraparichay.this, profile_page_hindi.class);
                    meraparichay.this.startActivity(registerIntent);
                    saveUserInformation();


                    SharedPreferences namedata = getApplicationContext().getSharedPreferences("ND", 0);
                    SharedPreferences.Editor editor = namedata.edit();

                    editor.putString("user_state", State);
                    editor.putString("user_occupation", Occupation);

                    editor.putString("user_name", Name);
                    editor.putString("user_father", Fathername);

                    editor.putString("user_post", PostOffice);
                    editor.putString("user_tehsil", Tehsil);

                    editor.putString("user_villageortown", VillageOrTown);
                    editor.putString("user_contact", ContactNumber);

                    editor.putString("user_district", District);
                    editor.putString("user_landowned", LandOwned);
                    editor.apply();}


            }
        });






}else{
            Spinner state = (Spinner) findViewById(R.id.sp);
            Spinner occupation = (Spinner) findViewById(R.id.occu);

            ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(meraparichay.this,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Statehindi));
            myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            state.setAdapter(myAdapter);

            String stateofthefuckinuser = namedata.getString("user_state", null);
            if(stateofthefuckinuser == "Andhra Pradesh"){
                state.setSelection(1);
            }else if(stateofthefuckinuser == "Arunachal Pradesh"){
                state.setSelection(2);
            }
            else if(stateofthefuckinuser == "Assam"){
                state.setSelection(3);
            }
            else if(stateofthefuckinuser == "Bihar"){
                state.setSelection(4);
            }
            else if(stateofthefuckinuser == "Chhattisgarh"){
                state.setSelection(5);
            }
            else if(stateofthefuckinuser == "Goa"){
                state.setSelection(6);
            }
            else if(stateofthefuckinuser == "Gujarat"){
                state.setSelection(7);
            }
            else if(stateofthefuckinuser == "Haryana"){
                state.setSelection(8);
            }
            else if(stateofthefuckinuser == "Himachal Pradesh"){
                state.setSelection(9);
            }
            else if(stateofthefuckinuser == "Jammu and Kashmir"){
                state.setSelection(10);
            }
            else if(stateofthefuckinuser == "Jharkhand"){
                state.setSelection(11);
            }
            else if(stateofthefuckinuser == "Karnataka"){
                state.setSelection(12);
            }
            else if(stateofthefuckinuser == "Kerala"){
                state.setSelection(13);
            }
            else if(stateofthefuckinuser == "Madhya Pradesh"){
                state.setSelection(14);
            }
            else if(stateofthefuckinuser == "Maharashtra"){
                state.setSelection(15);
            }
            else if(stateofthefuckinuser == "Manipur"){
                state.setSelection(16);
            }
            else if(stateofthefuckinuser == "Meghalaya"){
                state.setSelection(17);
            }
            else if(stateofthefuckinuser == "Mizoram"){
                state.setSelection(18);
            }
            else if(stateofthefuckinuser == "Nagaland"){
                state.setSelection(19);
            }
            else if(stateofthefuckinuser == "Orissa"){
                state.setSelection(20);
            }
            else if(stateofthefuckinuser == "Punjab"){
                state.setSelection(21);
            }
            else if(stateofthefuckinuser == "Rajasthan"){
                state.setSelection(22);
            }
            else if(stateofthefuckinuser == "Sikkim"){
                state.setSelection(23);
            }
            else if(stateofthefuckinuser == "Tamil Nadu"){
                state.setSelection(24);
            }
            else if(stateofthefuckinuser == "Tripura"){
                state.setSelection(25);
            }
            else if(stateofthefuckinuser == "Uttarakhand"){
                state.setSelection(26);
            }
            else if(stateofthefuckinuser == "Uttar Pradesh"){
                state.setSelection(27);
            }
            else if(stateofthefuckinuser == "West Bengal"){
                state.setSelection(28);
            }
            else if(stateofthefuckinuser == "Chandigarh"){
                state.setSelection(29);
            }
            else if(stateofthefuckinuser == "Delhi"){
                state.setSelection(30);
            }

            state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if(i == 0){

                    }else if (i == 1){
                        statecrop.setText("Andhra Pradesh");
                    }else if (i == 2){
                        statecrop.setText("Arunachal Pradesh");
                    }else if (i == 3){
                        statecrop.setText("Assam");
                    }else if (i == 4){
                        statecrop.setText("Bihar");
                    }else if (i == 5){
                        statecrop.setText("Chhattisgarh");
                    }else if (i == 6){
                        statecrop.setText("Goa");
                    } else if (i == 7){
                        statecrop.setText("Gujarat");
                    } else if (i == 8){
                        statecrop.setText("Haryana");
                    }else if (i == 9){
                        statecrop.setText("Himachal Pradesh");
                    }else if (i == 10){
                        statecrop.setText("Jammu and Kashmir");
                    }else if (i == 11){
                        statecrop.setText("Jharkhand");
                    }else if (i == 12){
                        statecrop.setText("Karnataka");
                    }else if (i == 13){
                        statecrop.setText("Kerala");
                    }else if (i == 14){
                        statecrop.setText("Madhya Pradesh");
                    }else if (i == 15){
                        statecrop.setText("Maharashtra");
                    }else if (i == 16){
                        statecrop.setText("Manipur");
                    }else if (i == 17){
                        statecrop.setText("Meghalaya");
                    }else if (i == 18){
                        statecrop.setText("Mizoram");
                    }else if (i == 19){
                        statecrop.setText("Nagaland");
                    }else if (i == 20){
                        statecrop.setText("Orissa");
                    }else if (i == 21){
                        statecrop.setText("Punjab");
                    }else if (i == 22){
                        statecrop.setText("Rajasthan");
                    }else if (i == 23){
                        statecrop.setText("Sikkim");
                    }else if (i == 24){
                        statecrop.setText("Tamil Nadu");
                    }else if (i == 25){
                        statecrop.setText("Tripura");
                    }else if (i == 26){
                        statecrop.setText("Uttarakhand");
                    }else if (i == 27){
                        statecrop.setText("Uttar Pradesh");
                    }else if (i == 28){
                        statecrop.setText("West Bengal");
                    }else if (i == 29){
                        statecrop.setText("Chandigarh");
                    }else if (i == 30){
                        statecrop.setText("Delhi");
                    }


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
            ArrayAdapter<String> occupationadapter = new ArrayAdapter<String>(meraparichay.this,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Occupationhindi));
            occupationadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            occupation.setAdapter(occupationadapter);

            String occupationofthefuckinuser = namedata.getString("user_occupation", null);

            if(occupationofthefuckinuser == "Farmer"){
                occupation.setSelection(1);
            }else if(occupationofthefuckinuser == "WW Employee"){
                occupation.setSelection(2);
            }
            else if(occupationofthefuckinuser == "Employee (Other)"){
                occupation.setSelection(3);
            }
            else if(occupationofthefuckinuser == "Scientist"){
                occupation.setSelection(4);
            }
            else if(occupationofthefuckinuser == "Student"){
                occupation.setSelection(5);
            }
            else if(occupationofthefuckinuser == "Dealer/Distributor"){
                occupation.setSelection(6);
            }
            else if(occupationofthefuckinuser == "Any Other"){
                occupation.setSelection(7);
            }

            occupation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if(i == 0){

                    }else if (i == 1){
                        occupationtext.setText("Farmer");
                    }else if (i == 2){
                        occupationtext.setText("WW Employee");
                    }else if (i == 3){
                        occupationtext.setText("Employee (Other)");
                    }else if (i == 4){
                        occupationtext.setText("Scientist");
                    }else if (i == 5){
                        occupationtext.setText("Student");
                    }else if (i == 6){
                        occupationtext.setText("Dealer/Distributer");
                    } else if (i == 7){
                        occupationtext.setText("Any Other");
                    }


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
            info = getSharedPreferences("Registration", 0);
            editor = info.edit();


            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);




            databaseReference = FirebaseDatabase.getInstance().getReference();
            n1 = (EditText)findViewById(R.id.name);
            f1 = (EditText)findViewById(R.id.fathersname);
            p1 = (EditText)findViewById(R.id.villageortown);

            po1 = (EditText)findViewById(R.id.postoffice);
            t1 = (EditText)findViewById(R.id.tehsil);
            d1 = (EditText)findViewById(R.id.district);

            pn1 = (EditText)findViewById(R.id.pno);
            l1 = (EditText)findViewById(R.id.area);
            d1 = (EditText)findViewById(R.id.district);
            pc1 = (EditText)findViewById(R.id.pincode);

            mcg = (EditText)findViewById(R.id.maj);

            n1.setText( namedata.getString("user_name", null));
            f1.setText( namedata.getString("user_father",null));
            p1.setText( namedata.getString("user_villageortown", null));
            po1.setText( namedata.getString("user_post",null));
            t1.setText( namedata.getString("user_tehsil", null));
            d1.setText( namedata.getString("user_district", null));
            pn1.setText( namedata.getString("user_contact", null));
            l1.setText( namedata.getString("user_landowned", null));
            d1.setText( namedata.getString("user_district", null));
            pc1.setText( namedata.getString("user_pincode", null));
            mcg.setText( namedata.getString("user_crop", null));


            inv = (Button) findViewById(R.id.invisible);
            inv.setOnClickListener(new View.OnClickListener(){
                boolean i = true;
                @Override
                public void onClick(View view) {
                    if(i == true){
                        inv.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.t1, 0);
                        f1.setVisibility(View.VISIBLE);
                        p1.setVisibility(View.VISIBLE);
                        po1.setVisibility(View.VISIBLE);
                        t1.setVisibility(View.VISIBLE);
                        pc1.setVisibility(View.VISIBLE);
                        d1.setVisibility(View.VISIBLE);
                        l1.setVisibility(View.VISIBLE);
                        mcg.setVisibility(View.VISIBLE);

                        i = false;
                    }else{
                        inv.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.t2, 0);
                        f1.setVisibility(View.GONE);
                        p1.setVisibility(View.GONE);
                        po1.setVisibility(View.GONE);
                        pc1.setVisibility(View.GONE);
                        t1.setVisibility(View.GONE);
                        d1.setVisibility(View.GONE);
                        l1.setVisibility(View.GONE);
                        mcg.setVisibility(View.GONE);

                        i = true;
                    }



                }
            });


            buttonsave = (Button) findViewById(R.id.buttonsubmit);


            buttonsave.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {

                    String State = statecrop.getText().toString();
                    String Occupation = occupationtext.getText().toString();

                    String Name = n1.getText().toString();
                    String Fathername = f1.getText().toString();
                    String PostOffice = po1.getText().toString();
                    String Tehsil = t1.getText().toString();
                    String District = d1.getText().toString();
                    String LandOwned = l1.getText().toString();
                    String VillageOrTown = p1.getText().toString();
                    String ContactNumber = pn1.getText().toString();
                    String Pincode = pc1.getText().toString();
                    String Crop = mcg.getText().toString();

                    if (Name.isEmpty() || Name.length() < 3 || Name.length() > 20){
                        Toast.makeText(getApplicationContext(),"अपना नाम दर्ज करें",Toast.LENGTH_SHORT).show();

                    }else if (State.isEmpty()){
                        Toast.makeText(getApplicationContext(),"राज्य चुनें!!",Toast.LENGTH_SHORT).show();
                    }
                    else if (Occupation.isEmpty()){
                        Toast.makeText(getApplicationContext(),"व्यवसाय का चयन करें!!",Toast.LENGTH_SHORT).show();
                    }
                    else if (ContactNumber.isEmpty() || ContactNumber.length() < 10){
                        Toast.makeText(getApplicationContext(),"एक वैध फोन नंबर दर्ज करें!",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Intent registerIntent = new Intent(meraparichay.this, profile_page_hindi.class);
                        meraparichay.this.startActivity(registerIntent);
                        saveUserInformation();


                        SharedPreferences namedata = getApplicationContext().getSharedPreferences("ND", 0);
                        SharedPreferences.Editor editor = namedata.edit();

                        editor.putString("user_state", State);
                        editor.putString("user_occupation", Occupation);

                        editor.putString("user_name", Name);
                        editor.putString("user_father", Fathername);

                        editor.putString("user_post", PostOffice);
                        editor.putString("user_tehsil", Tehsil);

                        editor.putString("user_villageortown", VillageOrTown);
                        editor.putString("user_contact", ContactNumber);

                        editor.putString("user_district", District);
                        editor.putString("user_landowned", LandOwned);

                        editor.putString("user_pincode", Pincode);
                        editor.putString("user_crop", Crop);
                        editor.apply();}


                }
            });
        }
    }
    private void saveUserInformation(){

        TextView cropadvisor3 = (TextView) findViewById(R.id.stt);
        TextView occupationtext = (TextView) findViewById(R.id.oc);
        String Name = n1.getText().toString().trim();
        String Fathername = f1.getText().toString().trim();
        String Pincode = pc1.getText().toString().trim();
        String State = cropadvisor3.getText().toString().trim();
        String Occupation = occupationtext.getText().toString().trim();

        String VillageOrTown = p1.getText().toString().trim();
        String PostOffice = po1.getText().toString().trim();
        String Tehsil = t1.getText().toString().trim();
        String District = d1.getText().toString().trim();

        String ContactNumber = pn1.getText().toString().trim();
        String LandOwned = l1.getText().toString().trim();

        String userId = databaseReference.push().getKey();


        UserInformation userInformation = new UserInformation(Name,Fathername,State,Occupation,VillageOrTown,PostOffice,Tehsil,District,ContactNumber,LandOwned,Pincode);
        databaseReference.child("ud").child(userId).setValue(userInformation);

        Toast.makeText(this, "Saving Information...", Toast.LENGTH_LONG).show();

        SharedPreferences notregistered1 = getSharedPreferences("notregistered", 0);
        SharedPreferences.Editor editor = notregistered1.edit();
        editor.putBoolean("notregistered", false);
        editor.apply();

        SharedPreferences register = getSharedPreferences("register", 0);
        SharedPreferences.Editor editor2 = register.edit();
        editor2.putBoolean("r", true);
        editor2.apply();

        SharedPreferences pr = getSharedPreferences("pr", 0);
        SharedPreferences.Editor editorpr = pr.edit();
        editorpr.putBoolean("premium", true);
        editorpr.apply();
    }

}

