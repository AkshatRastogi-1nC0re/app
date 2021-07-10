package com.willowood.akshatrastogi.willowoodagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class cropEnglish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_english);


        final Button cereal = (Button) findViewById(R.id.cerealcrops);
        cereal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(cropEnglish.this, cerealcrops.class);
                cropEnglish.this.startActivity(registerIntent);
            }
        });

        final Button pulses = (Button) findViewById(R.id.pulses);
        pulses.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(cropEnglish.this, pulses.class);
                cropEnglish.this.startActivity(registerIntent);
            }
        });

        final Button vegetables = (Button) findViewById(R.id.vegetables);
        vegetables.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(cropEnglish.this, vegetables.class);
                cropEnglish.this.startActivity(registerIntent);
            }
        });

        final Button fruit = (Button) findViewById(R.id.fruitcrops);
        fruit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(cropEnglish.this, fruitcrop.class);
                cropEnglish.this.startActivity(registerIntent);
            }
        });

        final Button other = (Button) findViewById(R.id.othercrops);
        other.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(cropEnglish.this, othercrops.class);
                cropEnglish.this.startActivity(registerIntent);
            }
        });
    }
}
