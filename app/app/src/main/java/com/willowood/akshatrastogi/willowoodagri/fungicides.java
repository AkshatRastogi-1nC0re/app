package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class fungicides extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fungicides);


        final Button sulcona = (Button) findViewById(R.id.sulcona);
        sulcona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, sulcona.class);
                fungicides.this.startActivity(registerIntent);
            }
        });



        final Button diazotop = (Button) findViewById(R.id.diazotop);
        diazotop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, diazotop.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

        final Button valxtra = (Button) findViewById(R.id.valxtra);
        valxtra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, valxtra.class);
                fungicides.this.startActivity(registerIntent);
            }
        });



        final Button mywillenglish = (Button) findViewById(R.id.mywil);
        mywillenglish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, mywillenglish.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

        final Button wilstrongeng = (Button) findViewById(R.id.wilstrong);
        wilstrongeng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, wilstrongeng.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

        final Button wilcoreeng = (Button) findViewById(R.id.wilcore);
        wilcoreeng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, wilcoreeng.class);
                fungicides.this.startActivity(registerIntent);
            }
        });
        final Button wilzoleplus = (Button) findViewById(R.id.wilzoleplus);
        wilzoleplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, wilzolepluseng.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

        final Button wilpower = (Button) findViewById(R.id.wilpower);
        wilpower.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, wilpowerenglish.class);
                fungicides.this.startActivity(registerIntent);
            }
        });
        final Button layby = (Button) findViewById(R.id.layby);
        layby.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, laybayenglish.class);
                fungicides.this.startActivity(registerIntent);
            }
        });
        final Button drcol = (Button) findViewById(R.id.drcol);
        drcol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, drcallenglish.class);
                fungicides.this.startActivity(registerIntent);
            }
        });
        final Button wiltez = (Button) findViewById(R.id.wiltez);
        wiltez.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, wiltez.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

        final Button wiltry = (Button) findViewById(R.id.wiltry);
        wiltry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, wiltry.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

        final Button theme = (Button) findViewById(R.id.theme);
        theme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, theme.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

        final Button phylum = (Button) findViewById(R.id.phylum);
        phylum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, phylum.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

        final Button carmel = (Button) findViewById(R.id.carmel);
        carmel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(fungicides.this, carmel.class);
                fungicides.this.startActivity(registerIntent);
            }
        });

    }
}
