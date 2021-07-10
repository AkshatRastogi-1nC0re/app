package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class othercrops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_othercrops);

        final Button wheat = (Button) findViewById(R.id.sugarcane);
        wheat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button paddy = (Button) findViewById(R.id.cotton);
        paddy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button weat = (Button) findViewById(R.id.mentha);
        weat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(othercrops.this, menthaenglish.class);
                othercrops.this.startActivity(registerIntent);

            }
        });

        final Button pady = (Button) findViewById(R.id.cumin);
        pady.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(othercrops.this, cumin_english.class);
                othercrops.this.startActivity(registerIntent);

            }
        });
    }
}
