package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class pgrs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgrs);

        final Button wilbloom = (Button) findViewById(R.id.wilbloom);
        wilbloom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(pgrs.this, wilbloom.class);
                pgrs.this.startActivity(registerIntent);
            }
        });

        final Button wilgib = (Button) findViewById(R.id.wilgib);
        wilgib.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(pgrs.this, wilgib.class);
                pgrs.this.startActivity(registerIntent);
            }
        });

        final Button brandsl = (Button) findViewById(R.id.brandsl);
        brandsl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(pgrs.this, brandsl.class);
                pgrs.this.startActivity(registerIntent);
            }
        });

        final Button wilripeeng = (Button) findViewById(R.id.wilripeeng);
        wilripeeng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(pgrs.this, wilripeeng.class);
                pgrs.this.startActivity(registerIntent);
            }
        });

        final Button brandgr = (Button) findViewById(R.id.brandgr);
        brandgr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(pgrs.this, brandgr.class);
                pgrs.this.startActivity(registerIntent);
            }
        });

        final Button wilbond = (Button) findViewById(R.id.wilbond);
        wilbond.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(pgrs.this, wilbond.class);
                pgrs.this.startActivity(registerIntent);
            }
        });

        final Button flyover = (Button) findViewById(R.id.flyover);
        flyover.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(pgrs.this, flyover.class);
                pgrs.this.startActivity(registerIntent);
            }
        });
    }
}
