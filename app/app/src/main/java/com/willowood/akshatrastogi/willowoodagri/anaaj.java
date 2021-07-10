package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.akshatrastogi.willowoodagri.R;

public class anaaj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anaaj);

        final Button paddy = (Button) findViewById(R.id.wheathindi);
        paddy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button chilli = (Button) findViewById(R.id.dhanhindi);
        chilli.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(anaaj.this, ricehindi.class);
                anaaj.this.startActivity(registerIntent);


            }
        });

    }
}
