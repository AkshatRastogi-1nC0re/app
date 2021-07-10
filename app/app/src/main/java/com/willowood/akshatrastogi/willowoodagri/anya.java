package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.akshatrastogi.willowoodagri.R;

public class anya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anya);

        final Button brinjal = (Button) findViewById(R.id.gannahindi);
        brinjal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button colecrops = (Button) findViewById(R.id.kapas);
        colecrops.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button pea = (Button) findViewById(R.id.menthahindi);
        pea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(anya.this, menthahindi.class);
                anya.this.startActivity(registerIntent);

            }
        });

        final Button ud = (Button) findViewById(R.id.jeerahindi);
        ud.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
