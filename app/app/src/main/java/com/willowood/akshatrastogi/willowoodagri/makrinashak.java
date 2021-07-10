package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class makrinashak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makrinashak);


        final Button wiltoxhindi = (Button) findViewById(R.id.wiltoxhindi);
        wiltoxhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(makrinashak.this, wiltoxhindi.class);
                makrinashak.this.startActivity(registerIntent);
            }
        });

        final Button willomitehindi = (Button) findViewById(R.id.willomitehindi);
        willomitehindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(makrinashak.this, willomitehindi.class);
                makrinashak.this.startActivity(registerIntent);
            }
        });


    }
}
