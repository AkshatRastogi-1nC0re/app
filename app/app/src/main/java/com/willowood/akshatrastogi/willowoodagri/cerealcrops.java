package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akshatrastogi.willowoodagri.R;

public class cerealcrops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerealcrops);


        final Button wheat = (Button) findViewById(R.id.wheat);
        wheat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Service is Under Construction",
                        Toast.LENGTH_SHORT).show();

            }
        });

        final Button paddy = (Button) findViewById(R.id.paddy);
        paddy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(cerealcrops.this, riceenglish.class);
                cerealcrops.this.startActivity(registerIntent);

            }
        });
    }
}
