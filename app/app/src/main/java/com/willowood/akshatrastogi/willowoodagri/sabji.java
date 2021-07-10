package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class sabji extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabji);

        final Button brinjal = (Button) findViewById(R.id.aalu);
        brinjal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(sabji.this, potato_hindi.class);
                sabji.this.startActivity(registerIntent);


            }
        });

        final Button tomato = (Button) findViewById(R.id.tamatar);
        tomato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(sabji.this, tomato_hindi.class);
                sabji.this.startActivity(registerIntent);


            }
        });

        final Button on = (Button) findViewById(R.id.onion);
        on.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(sabji.this, onion_hindi.class);
                sabji.this.startActivity(registerIntent);

            }
        });


        final Button pea = (Button) findViewById(R.id.mirch);
        pea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button ud = (Button) findViewById(R.id.gobhi);
        ud.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button a = (Button) findViewById(R.id.bengan);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "यह सेवा निर्माणाधीन है",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button m = (Button) findViewById(R.id.matar);
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(sabji.this, peahindi.class);
                sabji.this.startActivity(registerIntent);

            }
        });
    }
}
