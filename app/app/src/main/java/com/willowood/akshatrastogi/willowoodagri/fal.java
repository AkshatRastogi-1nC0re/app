package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class fal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fal);

        final Button brinjal = (Button) findViewById(R.id.aam);
        brinjal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fal.this, mango_hindi.class);
                fal.this.startActivity(registerIntent);

            }
        });

        final Button colecrops = (Button) findViewById(R.id.anar);
        colecrops.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fal.this, pomogrenade.class);
                fal.this.startActivity(registerIntent);
            }
        });

        final Button pea = (Button) findViewById(R.id.seb);
        pea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button ud = (Button) findViewById(R.id.kela);
        ud.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button a = (Button) findViewById(R.id.angoor);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
