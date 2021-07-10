package com.willowood.akshatrastogi.willowoodagri;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.akshatrastogi.willowoodagri.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class news_inside extends AppCompatActivity {
    ProgressDialog loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_inside);

        final ProgressDialog pd = new ProgressDialog(news_inside.this);

        ///////////////////////Declaring Text Views to be updated///////////////////////////////////

        TextView tv_title = (TextView) findViewById(R.id.TitleBig);
        TextView tv_body = (TextView) findViewById(R.id.bodyBig);
        ImageView iv_Big = (ImageView) findViewById(R.id.imageBig);

        ////////////////////////Getting Hold of Customer ID from Shared Prefferences ///////////////

        Intent lolintent = getIntent();
        String kast_id = lolintent.getStringExtra("newsId");


        loading =  ProgressDialog.show(this,"Loading","please wait",false,false);

        ///////////////////////////////Fetching Data ///////////////////////////////////////////////

        StringRequest stringRequest = new StringRequest(Request.Method.GET, Utilities.webAppUrl+"?action=addItem",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jobj = new JSONObject(response);
                            JSONArray jarray = jobj.getJSONArray("items");

                            for (int i = 0; i < jarray.length(); i++) {

                                JSONObject jo = jarray.getJSONObject(i);

                                String custid = jo.getString("news_id");

                                assert kast_id != null;
                                if(kast_id.equals(custid)){
                                    String image_link = jo.getString("image_link");
                                    String heading = jo.getString("heading");
                                    String description = jo.getString("description");

                                    Glide.with(news_inside.this).load(image_link).into(iv_Big);

                                    loading.dismiss();

                                    tv_title.setText(heading);
                                    tv_body.setText(description);

                                    break;



                                }




                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(news_inside.this, "Error: Please Check Your Network Condition", Toast.LENGTH_SHORT).show();

                    }
                }
        );

        int socketTimeOut = 50000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);

        stringRequest.setRetryPolicy(policy);

        RequestQueue queue = Volley.newRequestQueue(news_inside.this);
        queue.add(stringRequest);


    }
}