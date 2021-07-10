package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class pulses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulses);

        final Button soyabean = (Button) findViewById(R.id.soyabean);
        soyabean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               Intent i  = new Intent (pulses.this , soyabeanenglish.class);
               startActivity(i);
            }
        });

        final Button bengalgram = (Button) findViewById(R.id.bengalgram);
        bengalgram.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button redgram = (Button) findViewById(R.id.redgram);
        redgram.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button greengram = (Button) findViewById(R.id.greengram);
        greengram.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button blackgram = (Button) findViewById(R.id.blackgram);
        blackgram.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
