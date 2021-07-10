package com.willowood.akshatrastogi.willowoodagri;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.akshatrastogi.willowoodagri.BuildConfig;
import com.example.akshatrastogi.willowoodagri.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class News extends AppCompatActivity implements CourseAdapter.OnNoteListener{

    private RecyclerView courseRV;
    private ArrayList<CourseModel> courseModelArrayList;
    ProgressDialog loading;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        courseRV = findViewById(R.id.idRVCourse);

        loading =  ProgressDialog.show(this,"Loading","please wait",false,false);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, Utilities.webAppUrl+"?action=addItem",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        list = new ArrayList<>();
                        try {
                            JSONObject jobj = new JSONObject(response);
                            JSONArray jarray = jobj.getJSONArray("items");
                            int a = 0;
                            courseModelArrayList = new ArrayList<>();

                            for (int i = 0; i < jarray.length(); i++) {

                                JSONObject jo = jarray.getJSONObject(i);
                                String news_id = jo.getString("news_id");
                                String image_link = jo.getString("image_link");
                                String heading = jo.getString("heading");
                                String description = jo.getString("description");
                                String desc = first_words_seperator.firstWords(description, 10) + "...";
                                courseModelArrayList.add(new CourseModel(heading, desc));
                                list.add(a,news_id);
                                a = a + 1;
                            }

                            CourseAdapter courseAdapter = new CourseAdapter(News.this, courseModelArrayList,News.this::onNoteClick);
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(News.this, LinearLayoutManager.VERTICAL, false);

                            courseRV.setLayoutManager(linearLayoutManager);
                            courseRV.setAdapter(courseAdapter);
                            loading.dismiss();
                            

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(News.this, "Error: Please Contact Akshat Rastogi", Toast.LENGTH_SHORT).show();

                    }


                }


        );

        int socketTimeOut = 50000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);

        stringRequest.setRetryPolicy(policy);

        RequestQueue queue = Volley.newRequestQueue(News.this);
        queue.add(stringRequest);

        class Program {

            public String firstWords(String input, int words) {
                for (int i = 0; i < input.length(); i++) {
                    // When a space is encountered, reduce words remaining by 1.
                    if (input.charAt(i) == ' ') {
                        words--;
                    }
                    // If no more words remaining, return a substring.
                    if (words == 0) {
                        return input.substring(0, i);
                    }
                }
                // Error case.
                return "";
            }

        }

    }

    @Override
    public void onNoteClick(int position) {
        Intent intent = new Intent(this, news_inside.class);
        intent.putExtra("newsId",list.get(position));
        startActivity(intent);

    }
}








