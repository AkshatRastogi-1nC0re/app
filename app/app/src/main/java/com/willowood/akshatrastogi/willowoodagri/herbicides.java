package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class herbicides extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbicides);

        final Button willosate = (Button) findViewById(R.id.willosate);
        willosate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, willosate.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button halowil = (Button) findViewById(R.id.halowil);
        halowil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, halowilenglish.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button wilforce32eng = (Button) findViewById(R.id.wilforce32eng);
        wilforce32eng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, wilforce32english.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button wilsuperenglish = (Button) findViewById(R.id.wilsupereng);
        wilsuperenglish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, wilsuperenglish.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button clodexo = (Button) findViewById(R.id.clodexo);
        clodexo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, clodexo.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button oxyguard = (Button) findViewById(R.id.oxyguard);
        oxyguard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, oxyguard.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button patriot = (Button) findViewById(R.id.patriot);
        patriot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, patriot.class);
                herbicides.this.startActivity(registerIntent);
            }
        });
        final Button wilfit = (Button) findViewById(R.id.wilfit);
        wilfit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, wilfit.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button octavia = (Button) findViewById(R.id.octavia);
        octavia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, octavia.class);
                herbicides.this.startActivity(registerIntent);
            }
        });


        final Button wilquat = (Button) findViewById(R.id.wilquat);
        wilquat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, wilquat.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button willosate71 = (Button) findViewById(R.id.willosate71);
        willosate71.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, willosate71.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button wilfop = (Button) findViewById(R.id.wilfop);
        wilfop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, wilfop.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

        final Button sms = (Button) findViewById(R.id.sms);
        sms.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(herbicides.this, sms.class);
                herbicides.this.startActivity(registerIntent);
            }
        });

    }
}
