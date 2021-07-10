package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class crophindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crophindi);

        final Button anaaj = (Button) findViewById(R.id.anaaj);
        anaaj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(crophindi.this, anaaj.class);
                crophindi.this.startActivity(registerIntent);
            }
        });

        final Button dalhan = (Button) findViewById(R.id.dalhan);
        dalhan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(crophindi.this, dalhan.class);
                crophindi.this.startActivity(registerIntent);
            }
        });
        final Button sabji = (Button) findViewById(R.id.sabji);
        sabji.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(crophindi.this, sabji.class);
                crophindi.this.startActivity(registerIntent);
            }
        });

        final Button fal = (Button) findViewById(R.id.fal);
        fal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(crophindi.this, fal.class);
                crophindi.this.startActivity(registerIntent);
            }
        });

        final Button anya = (Button) findViewById(R.id.anya);
        anya.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(crophindi.this, anya.class);
                crophindi.this.startActivity(registerIntent);
            }
        });



    }
}
