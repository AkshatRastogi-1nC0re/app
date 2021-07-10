package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class miticide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miticide);

        final Button willomiteeng = (Button) findViewById(R.id.willomiteeng);
        willomiteeng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(miticide.this, willomiteeng.class);
                miticide.this.startActivity(registerIntent);
            }
        });
        final Button wiltoxenglish = (Button) findViewById(R.id.wiltox);
        wiltoxenglish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(miticide.this, wiltoxenglish.class);
                miticide.this.startActivity(registerIntent);
            }
        });

    }
}
