package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class vegetables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        final Button wheat = (Button) findViewById(R.id.potato);
        wheat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(vegetables.this, potato_english.class);
                vegetables.this.startActivity(registerIntent);
            }
        });

        final Button tomato = (Button) findViewById(R.id.tomato);
        tomato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(vegetables.this, tomato_english.class);
                vegetables.this.startActivity(registerIntent);
            }
        });

        final Button on = (Button) findViewById(R.id.onion);
        on.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(vegetables.this, onion_english.class);
                vegetables.this.startActivity(registerIntent);

            }
        });

        final Button chilli = (Button) findViewById(R.id.chilli);
        chilli.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button brinjal = (Button) findViewById(R.id.brinjal);
        brinjal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button colecrops = (Button) findViewById(R.id.colecrops);
        colecrops.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button pea = (Button) findViewById(R.id.pea);
        pea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(vegetables.this, peahindi.class);
                vegetables.this.startActivity(registerIntent);

            }
        });
    }
}
