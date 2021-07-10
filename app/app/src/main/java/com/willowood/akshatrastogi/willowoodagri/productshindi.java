package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class productshindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productshindi);

        final Button kitnashak = (Button) findViewById(R.id.kitnashak);
        kitnashak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productshindi.this, kitnashak.class);
                productshindi.this.startActivity(registerIntent);
            }
        });

        final Button surfactanthindi = (Button) findViewById(R.id.surfactanthindi);
        surfactanthindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productshindi.this, surfactanthindi.class);
                productshindi.this.startActivity(registerIntent);
            }
        });

        final Button makrinashak = (Button) findViewById(R.id.makarinashak);
        makrinashak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productshindi.this, makrinashak.class);
                productshindi.this.startActivity(registerIntent);
            }
        });

        final Button fafundnashak = (Button) findViewById(R.id.fafundnashak);
        fafundnashak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productshindi.this, fafundnashak.class);
                productshindi.this.startActivity(registerIntent);
            }
        });

        final Button kharpatwarnashak = (Button) findViewById(R.id.kharpatwarnashak);
        kharpatwarnashak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productshindi.this, kharpatwarnashak.class);
                productshindi.this.startActivity(registerIntent);
            }
        });

        final Button paudhvikasvardhak = (Button) findViewById(R.id.paudhvikasvardhak);
        paudhvikasvardhak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(productshindi.this, paudhvikasvardhak.class);
                productshindi.this.startActivity(registerIntent);
            }
        });
    }
}
