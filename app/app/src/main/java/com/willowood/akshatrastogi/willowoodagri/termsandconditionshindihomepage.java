package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class termsandconditionshindihomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termsandconditionshindihomepage);

        final Button termsbutton = (Button) findViewById(R.id.ermsbutton);
        termsbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(termsandconditionshindihomepage.this, tceh.class);
                termsandconditionshindihomepage.this.startActivity(registerIntent);
            }
        });

        final Button privacybutton = (Button) findViewById(R.id.rivacybutton);
        privacybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(termsandconditionshindihomepage.this, ppeh.class);
                termsandconditionshindihomepage.this.startActivity(registerIntent);
            }
        });
    }
}
