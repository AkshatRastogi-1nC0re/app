package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class paudhvikasvardhak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paudhvikasvardhak);

        final Button wilbloomhindi = (Button) findViewById(R.id.wilbloomhindi);
        wilbloomhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(paudhvikasvardhak.this, wilbloomhindi.class);
                paudhvikasvardhak.this.startActivity(registerIntent);
            }
        });

        final Button wilgibhindi = (Button) findViewById(R.id.wilgibhindi);
        wilgibhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(paudhvikasvardhak.this, wilgibhindi.class);
                paudhvikasvardhak.this.startActivity(registerIntent);
            }
        });

        final Button brandslhindi = (Button) findViewById(R.id.brandslhindi);
        brandslhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(paudhvikasvardhak.this, brandslhindi.class);
                paudhvikasvardhak.this.startActivity(registerIntent);
            }
        });

        final Button wilripehindi = (Button) findViewById(R.id.wilripehindi);
        wilripehindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(paudhvikasvardhak.this, wilripehindi.class);
                paudhvikasvardhak.this.startActivity(registerIntent);
            }
        });


        final Button flyoverhindi = (Button) findViewById(R.id.flyoverhindi);
        flyoverhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(paudhvikasvardhak.this, flyoverhindi.class);
                paudhvikasvardhak.this.startActivity(registerIntent);
            }
        });

        final Button brandgrhindi = (Button) findViewById(R.id.brandgrhindi);
        brandgrhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(paudhvikasvardhak.this, brandgrhindi.class);
                paudhvikasvardhak.this.startActivity(registerIntent);
            }
        });

        final Button wilbondhindi = (Button) findViewById(R.id.wilbondhindi);
        wilbondhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(paudhvikasvardhak.this, wilbondhindi.class);
                paudhvikasvardhak.this.startActivity(registerIntent);
            }
        });
    }
}
