package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class fafundnashak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fafundnashak);


        final Button sulconahindi = (Button) findViewById(R.id.sulconahindi);
        sulconahindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, sulconahindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button diazotophindi = (Button) findViewById(R.id.diazotophindi);
        diazotophindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, diazotophindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button valxtrahindi = (Button) findViewById(R.id.valxtrahindi);
        valxtrahindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, valxtrahindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button wp = (Button) findViewById(R.id.wilpowerhindi);
        wp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, wilpowerhindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button wh = (Button) findViewById(R.id.wilstronghindi);
        wh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, wilstronghindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });


        final Button wilcorehindi = (Button) findViewById(R.id.wilcorehindi);
        wilcorehindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, wilcorehindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button laybyhin = (Button) findViewById(R.id.laybyhindi);
        laybyhin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, laybyhindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button drcolhin = (Button) findViewById(R.id.drcolhindi);
        drcolhin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, drcolhindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button wilzoleplushin = (Button) findViewById(R.id.wilzoleplushindi);
        wilzoleplushin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, wilzoleplushin.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button mywillhindi = (Button) findViewById(R.id.mywilhindi);
        mywillhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, mywillhindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button themehindi = (Button) findViewById(R.id.themehindi);
        themehindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, themehindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button wiltryhindi = (Button) findViewById(R.id.wiltryhindi);
        wiltryhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, wiltryhindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button phylumhindi = (Button) findViewById(R.id.phylumhindi);
        phylumhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, phylumhindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button wiltezhindi = (Button) findViewById(R.id.wiltezhindi);
        wiltezhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, wiltezhindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });

        final Button carmelhindi = (Button) findViewById(R.id.carmelhindi);
        carmelhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fafundnashak.this, carmelhindi.class);
                fafundnashak.this.startActivity(registerIntent);
            }
        });
    }
}
