package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class dalhan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalhan);

        final Button soyabean = (Button) findViewById(R.id.soyabeanhindi);
        soyabean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(dalhan.this, soyabean.class);
                dalhan.this.startActivity(registerIntent);

            }
        });

        final Button brinjal = (Button) findViewById(R.id.chanahindi);
        brinjal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button colecrops = (Button) findViewById(R.id.arharhindi);
        colecrops.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button pea = (Button) findViewById(R.id.moonghindi);
        pea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button ud = (Button) findViewById(R.id.uradhindi);
        ud.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });


    }
}
