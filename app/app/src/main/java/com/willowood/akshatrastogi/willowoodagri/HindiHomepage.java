package com.willowood.akshatrastogi.willowoodagri;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.akshatrastogi.willowoodagri.R;

public class HindiHomepage extends AppCompatActivity {
    private static final int REQUEST_CALL =1;
    boolean connected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_homepage);

        final Button aboutus = (Button) findViewById(R.id.abtuss);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, hindiaboutus.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });

        final Button antidotehindi = (Button) findViewById(R.id.antidotehindi);
        antidotehindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, antidotehindi.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });

        final Button imagehindi = (Button) findViewById(R.id.hindiimage);
        imagehindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, mainactivityhindi.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });

        final Button tch = (Button) findViewById(R.id.termsandconditionshomepage);
        tch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, termsandconditionshindihomepage.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });

        final Button ch = (Button) findViewById(R.id.contactushindi);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, contactpagehindi.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });

        final Button n = (Button) findViewById(R.id.newshindi);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, NewsHindi.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });


        final Button products = (Button) findViewById(R.id.products);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, productshindi.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });


        final Button crops = (Button) findViewById(R.id.cropseng);
        crops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, crophindi.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });

        final Button representative = (Button) findViewById(R.id.representative);
        representative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pr = getSharedPreferences("pr", MODE_PRIVATE);
                boolean premium = pr.getBoolean("premium", false);
                if (premium == true) {
                    Intent registerIntent = new Intent(HindiHomepage.this, wwadvisorhindi.class);
                    HindiHomepage.this.startActivity(registerIntent);
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(HindiHomepage.this, R.style.MyDialogTheme);
                    builder.setTitle("कृप्या स्वयं को पंजीकृत करें");
                    builder.setIcon(R.drawable.willowoodlogofinaldialog);
                    builder.setCancelable(false);
                    builder.setMessage("यह सुविधा प्रीमियम है| इस सुविधा का लाभ उठाने के लिए स्वयं को पंजीकृत करें")
                            .setPositiveButton("ठीक है!", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            }
        });

        final Button meraparichay = (Button) findViewById(R.id.distributer);
        meraparichay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    SharedPreferences ekbarregister = getSharedPreferences("ekbarregister", MODE_PRIVATE);
                    boolean ebr = ekbarregister.getBoolean("ebr", false);
                    if (!ebr){
                        SharedPreferences notregistered1 = getSharedPreferences("notregistered", 0);
                        boolean notregistered = notregistered1.getBoolean("notregistered", true);
                        if (notregistered) {
                            Intent registerIntent = new Intent(HindiHomepage.this, meraparichay.class);
                            registerIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                            HindiHomepage.this.startActivity(registerIntent);
                        } else {
                            Intent i = new Intent(HindiHomepage.this, profile_page_hindi.class);
                            HindiHomepage.this.startActivity(i);
                        }
                    } else {
                        final AlertDialog.Builder builder = new AlertDialog.Builder(HindiHomepage.this, R.style.MyDialogTheme);
                        builder.setTitle("आप अपना पंजीकरण कर चुके हैं");
                        builder.setIcon(R.drawable.willowoodlogofinaldialog);
                        builder.setCancelable(false);
                        builder.setMessage("आप अंग्रेजी भाषा में अपना पंजीकरण कर चुके हैं| आप अपना पंजीकरण केवल एक बार ही कर सकते है|")
                                .setPositiveButton("ठीक है!", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = builder.create();
                        alert.show();
                    }
                }

            });

        final Button safety = (Button) findViewById(R.id.safeuseenglish);
        safety.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HindiHomepage.this, suraksha.class);
                HindiHomepage.this.startActivity(registerIntent);
            }
        });


    }

    public void openURLinBrowser(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.yahoo.com/news/weather"));
        startActivity(browserIntent);
    }

    public void website(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.willowood.com"));
        startActivity(browserIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main_hindi, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int idh = item.getItemId();

        switch (idh){

            case (R.id.shareh):
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String sharebody = "https://play.google.com/store/apps/details?id=com.willowood.akshatrastogi.willowoodagri";
                String shareTitle = "Let me recommemd you to download WILLOWOOD AGRI APP. Click the link below to download:";
                share.putExtra(Intent.EXTRA_SUBJECT,shareTitle);
                share.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(share , "Share App Using"));
                break;

        }

        switch (idh){

            case (R.id.rateh):
                final String appPackageName = getPackageName();
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
                break;

        }
        return true;
    }

    public void onBackPressed() {
        Intent registerIntent = new Intent(HindiHomepage.this, LanguageActivity.class);
        HindiHomepage.this.startActivity(registerIntent);
        super.onBackPressed();
    }

}
// Copyright by Akshat Rastogi 20/04/2018