package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class productsenglish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productsenglish);

        final Button insecticide = (Button) findViewById(R.id.insecticide);
        insecticide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productsenglish.this, insecticide.class);
                productsenglish.this.startActivity(registerIntent);
            }
        });

        final Button surfactant = (Button) findViewById(R.id.surfactant);
        surfactant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productsenglish.this, surfactant.class);
                productsenglish.this.startActivity(registerIntent);
            }
        });

        final Button miticide = (Button) findViewById(R.id.miticide1);
        miticide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productsenglish.this, miticide.class);
                productsenglish.this.startActivity(registerIntent);
            }
        });

        final Button fungicide = (Button) findViewById(R.id.fungicides);
        fungicide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productsenglish.this, fungicides.class);
                productsenglish.this.startActivity(registerIntent);
            }
        });

        final Button pgrs = (Button) findViewById(R.id.pgrs);
        pgrs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productsenglish.this, pgrs.class);
                productsenglish.this.startActivity(registerIntent);
            }
        });

        final Button herbicides = (Button) findViewById(R.id.herbicides);
        herbicides.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productsenglish.this, herbicides.class);
                productsenglish.this.startActivity(registerIntent);
            }
        });
    }
}
