package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class fruitcrop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitcrop);

        final Button paddy = (Button) findViewById(R.id.mango);
        paddy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fruitcrop.this, mango_hindi.class);
                fruitcrop.this.startActivity(registerIntent);

            }
        });

        final Button chilli = (Button) findViewById(R.id.pomegranade);
        chilli.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fruitcrop.this, pomogrenade.class);
                fruitcrop.this.startActivity(registerIntent);

            }
        });

        final Button brinjal = (Button) findViewById(R.id.apple);
        brinjal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button colecrops = (Button) findViewById(R.id.banana);
        colecrops.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button pea = (Button) findViewById(R.id.grapes);
        pea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
