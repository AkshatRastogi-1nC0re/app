package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class kharpatwarnashak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kharpatwarnashak);

        final Button indicahindi = (Button) findViewById(R.id.clodexohin);
        indicahindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, clodexohindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button halowilhindi = (Button) findViewById(R.id.halowilhindi);
        halowilhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, halowilhindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button wilforce32hindi = (Button) findViewById(R.id.wilforce32hindi);
        wilforce32hindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, wilforce32hindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button wilsuperhindi = (Button) findViewById(R.id.wilsuperhindi);
        wilsuperhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, wilsuperhindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button oxyguardhindi = (Button) findViewById(R.id.oxyguardhindi);
        oxyguardhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, oxyguardhindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button smshindi = (Button) findViewById(R.id.smshindi);
        smshindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, smshindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button patriothindi = (Button) findViewById(R.id.patriothindi);
        patriothindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, patriothindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button wilfithindi = (Button) findViewById(R.id.wilfithindi);
        wilfithindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, wilfithindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button willosatehindi = (Button) findViewById(R.id.willosatehindi);
        willosatehindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, willosatehindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button wilfophindi = (Button) findViewById(R.id.wilfophindi);
        wilfophindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, wilfophindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button octaviahindi = (Button) findViewById(R.id.octaviahindi);
        octaviahindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, octaviahindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button wilquathindi = (Button) findViewById(R.id.wilquathindi);
        wilquathindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, wilquathindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });

        final Button willosate71hindi = (Button) findViewById(R.id.willosate71hindi);
        willosate71hindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(kharpatwarnashak.this, willosate71hindi.class);
                kharpatwarnashak.this.startActivity(registerIntent);
            }
        });
    }
}
