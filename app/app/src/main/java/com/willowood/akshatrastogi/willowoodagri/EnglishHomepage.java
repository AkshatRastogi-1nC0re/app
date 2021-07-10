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

public class EnglishHomepage extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    boolean connected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_english_homepage);

        SharedPreferences namedata = getApplicationContext().getSharedPreferences("ND", 0);
        String s = namedata.getString("user_state", null);

        final Button aboutus = (Button) findViewById(R.id.abtuss);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, aboutus.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });

        final Button antidoteenglish = (Button) findViewById(R.id.antidote);
        antidoteenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, AntidoteEngish.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });


        final Button news = (Button) findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, News.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });

        final Button contactus = (Button) findViewById(R.id.contactus);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, contactus.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });


        final Button products = (Button) findViewById(R.id.products);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, productsenglish.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });
        final Button Distributer = (Button) findViewById(R.id.distributer);
        Distributer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences register = getSharedPreferences("register", MODE_PRIVATE);
                boolean r = register.getBoolean("r", false);
                if (r == false) {
                    SharedPreferences notregistered1 = getSharedPreferences("notregistered", 0);
                    boolean notregistered = notregistered1.getBoolean("notregistered", true);
                    if (notregistered) {
                        Intent registerIntent = new Intent(EnglishHomepage.this, UserProfile.class);
                        registerIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        EnglishHomepage.this.startActivity(registerIntent);
                    } else {
                        Intent i = new Intent(EnglishHomepage.this, ProfilePage.class);
                        EnglishHomepage.this.startActivity(i);
                    }
                }else{
                    final AlertDialog.Builder builder = new AlertDialog.Builder(EnglishHomepage.this, R.style.MyDialogTheme);
                    builder.setTitle("You have already been registered!");
                    builder.setIcon(R.drawable.willowoodlogofinaldialog);
                    builder.setCancelable(false);
                    builder.setMessage("You have already registered yourself in Hindi Language! You can register only once")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
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

        final Button safeuseenglish = (Button) findViewById(R.id.safeuseenglish);
        safeuseenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, safeuseenglish.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });

        final Button crops = (Button) findViewById(R.id.cropseng);
        crops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, cropEnglish.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });


        final Button representative = (Button) findViewById(R.id.representative);
        representative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pr = getSharedPreferences("pr", MODE_PRIVATE);
                boolean premium = pr.getBoolean("premium", false);
                if (premium == true) {
                    Intent registerIntent = new Intent(EnglishHomepage.this, wwadvisor.class);
                    EnglishHomepage.this.startActivity(registerIntent);
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(EnglishHomepage.this, R.style.MyDialogTheme);
                    builder.setTitle("Kindly Register Yourself");
                    builder.setIcon(R.drawable.willowoodlogofinaldialog);
                    builder.setCancelable(false);
                    builder.setMessage("This is a premium feature. Kindly Register yourself to get in contact with Willowood Advisors")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
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

        final Button termsandconditions = (Button) findViewById(R.id.termsandconditionshomepage);
        termsandconditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, termsandconditionshomepage.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });

        final Button image_clasification = (Button) findViewById(R.id.image);
        image_clasification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(EnglishHomepage.this, mainactivity.class);
                EnglishHomepage.this.startActivity(registerIntent);
            }
        });


    }

    public void openURLinBrowser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.yahoo.com/news/weather"));
        startActivity(browserIntent);
    }

    public void website(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.willowood.com"));
        startActivity(browserIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);


        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case (R.id.share):
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String sharebody = "https://play.google.com/store/apps/details?id=com.willowood.akshatrastogi.willowoodagri";
                String shareTitle = "Let me recommemd you to download WILLOWOOD AGRI APP. Click the link below to download:";
                share.putExtra(Intent.EXTRA_SUBJECT, shareTitle);
                share.putExtra(Intent.EXTRA_TEXT, sharebody);
                startActivity(Intent.createChooser(share, "Share App Using"));
                break;

        }


        switch (id) {

            case (R.id.rate):
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
        Intent registerIntent = new Intent(EnglishHomepage.this, LanguageActivity.class);
        EnglishHomepage.this.startActivity(registerIntent);
        super.onBackPressed();
    }


}


// Copyright by Akshat Rastogi 20/04/2018