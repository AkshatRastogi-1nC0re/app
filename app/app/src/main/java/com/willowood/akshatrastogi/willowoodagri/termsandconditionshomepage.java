package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class termsandconditionshomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termsandconditionshomepage);

        final Button termsbutton = (Button) findViewById(R.id.terbutton);
        termsbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(termsandconditionshomepage.this, tceh.class);
                termsandconditionshomepage.this.startActivity(registerIntent);
            }
        });

        final Button privacybutton = (Button) findViewById(R.id.privbutton);
        privacybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(termsandconditionshomepage.this, ppeh.class);
                termsandconditionshomepage.this.startActivity(registerIntent);
            }
        });
    }
}
