package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.akshatrastogi.willowoodagri.R;

public class profile_page_hindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page_hindi);
        SharedPreferences registeredonce = getSharedPreferences("registeredonce", 0);
        SharedPreferences.Editor edito = registeredonce.edit();
        edito.putBoolean("registeredonce", false);
        edito.apply();
        TextView tv_name = (TextView) findViewById(R.id.username);
        SharedPreferences namedata = getApplicationContext().getSharedPreferences("ND", 0);
        String name = namedata.getString("user_name", null);
        tv_name.setText(name);
        final Button pbr = (Button) findViewById(R.id.privacybutton);
        pbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(profile_page_hindi.this, ppeh.class);
                profile_page_hindi.this.startActivity(registerIntent);
            }
        });

        final Button eyd = (Button) findViewById(R.id.editbutton);
        eyd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(profile_page_hindi.this, meraparichay.class);
                profile_page_hindi.this.startActivity(registerIntent);
            }
        });
    }

    public void onBackPressed() {
        Intent registerIntent = new Intent(profile_page_hindi.this, HindiHomepage.class);
        profile_page_hindi.this.startActivity(registerIntent);
        super.onBackPressed();
    }

}