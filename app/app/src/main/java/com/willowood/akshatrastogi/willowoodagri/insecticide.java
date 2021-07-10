package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.BuildConfig;
import com.example.akshatrastogi.willowoodagri.R;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class insecticide extends AppCompatActivity {


    private FirebaseRemoteConfig mFirebaseRemoteConfig;
    private static final String ee = "exotica_enable";
    private static final String ep = "exotica_picture_display";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insecticide);

        final Button pacemaker = (Button) findViewById(R.id.pacemaker);
        pacemaker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, pacemaker.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button deltrom = (Button) findViewById(R.id.deltrom);
        deltrom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, deltrom.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button innovexia = (Button) findViewById(R.id.innovexia);
        innovexia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, innovexia.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button dna = (Button) findViewById(R.id.dna);
        dna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, dnaenglish.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button wiljosh = (Button) findViewById(R.id.wiljosh);
        wiljosh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, wiljoshenglish.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button wilfly = (Button) findViewById(R.id.wilfly);
        wilfly.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, wilflyenglish.class);
                insecticide.this.startActivity(registerIntent);
            }
        });




        final Button exotica = (Button) findViewById(R.id.exotica);
        exotica.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, exotica.class);
                insecticide.this.startActivity(registerIntent);
            }
        });


        final Button wilqueen = (Button) findViewById(R.id.wilqueen);
        wilqueen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, wilqueenenglish.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button wilace = (Button) findViewById(R.id.wilace);
        wilace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, wilaceenglish.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button breakeng = (Button) findViewById(R.id.breakeng);
        breakeng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, breakeng.class);
                insecticide.this.startActivity(registerIntent);
            }
        });


        final Button leopard = (Button) findViewById(R.id.leopard70wg);
        leopard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, leopard.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button emacto = (Button) findViewById(R.id.emacto);
        emacto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, emacto.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button wilking = (Button) findViewById(R.id.WILKING);
        wilking.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, wilkingenglish.class);
                insecticide.this.startActivity(registerIntent);
            }
        });
        final Button willoxam = (Button) findViewById(R.id.willoxam);
        willoxam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, willoxam.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button willoxamfs = (Button) findViewById(R.id.willoxamfs);
        willoxamfs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, willoxamfsenglish.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button sunnyclassic = (Button) findViewById(R.id.sunnyclassic);
        sunnyclassic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, sunnyclassic.class);
                insecticide.this.startActivity(registerIntent);
            }
        });


        final Button wilthrin = (Button) findViewById(R.id.wilthrin);
        wilthrin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, wilthrin.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        final Button antenna = (Button) findViewById(R.id.antenna);
        antenna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, antenna.class);
                insecticide.this.startActivity(registerIntent);
            }
        });
        final Button taurate = (Button) findViewById(R.id.taurate);
        taurate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, taurate.class);
                insecticide.this.startActivity(registerIntent);
            }
        });

        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build();
        mFirebaseRemoteConfig.setConfigSettings(configSettings);



        final Button teknox = (Button) findViewById(R.id.teknox);
        teknox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(insecticide.this, teknox.class);
                insecticide.this.startActivity(registerIntent);
            }
        });



    }
}
