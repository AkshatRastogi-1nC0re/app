package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.akshatrastogi.willowoodagri.R;

public class termsandconditions extends AppCompatActivity {

    boolean bothchecked1 = false;
    boolean bothchecked2 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termsandconditions);


        TextView terms = (TextView) this.findViewById(R.id.terms);
        terms.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(termsandconditions.this, tandcpage.class);
                startActivity(intent);
            }
        });

        TextView pp = (TextView) this.findViewById(R.id.privacy);
        pp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(termsandconditions.this, privacypolicy.class);
                startActivity(intent);
            }
        });

        final Switch privacy = (Switch)  findViewById(R.id.s2);
        privacy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean privacy) {
                Button lol = (Button) findViewById(R.id.lol);
                lol.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        Intent registerIntent = new Intent(termsandconditions.this, LanguageActivity.class);
                        termsandconditions.this.startActivity(registerIntent);
                        SharedPreferences prefs = getSharedPreferences("prefs", 0);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("agreed", true);
                        editor.apply(

                        );
                    }
                });

                if (privacy) {
                    bothchecked1 = true;
                }
                else {
                    bothchecked1 = false;
                    lol.setBackgroundColor(Color.parseColor("#038C11"));
                    lol.setEnabled(false);
                }


            }


        });
        Switch onOffSwitch = (Switch)  findViewById(R.id.s1);
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                final Button lol = (Button) findViewById(R.id.lol);
                

                if (isChecked) {
                    bothchecked2 = true;
                }
                else {
                    bothchecked2 = false;
                    lol.setBackgroundColor(Color.parseColor("#038C11"));
                }

            }

        });

        while (bothchecked1&bothchecked2) {
            Button lol = (Button) findViewById(R.id.lol);
            lol.setBackgroundColor(Color.parseColor("#038C11"));
            lol.setEnabled(true);


        }


    }
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

}
