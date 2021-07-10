package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class surfactanthindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surfactanthindi);


        final Button wiliconhindi = (Button) findViewById(R.id.wiliconhindi);
        wiliconhindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(surfactanthindi.this, wiliconhindi.class);
                surfactanthindi.this.startActivity(registerIntent);
            }
        });
    }
}
