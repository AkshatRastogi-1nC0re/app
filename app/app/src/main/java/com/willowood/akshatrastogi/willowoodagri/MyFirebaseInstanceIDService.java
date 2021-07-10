package com.willowood.akshatrastogi.willowoodagri;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Akshat Rastogi on 13-05-2018.
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    String refreshedToken;

    @Override
    public void onTokenRefresh() {
        Log.d("mylog", "Inside on token refresh");
        //Getting registration token
        refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //Displaying token on logcat
        Log.d("mylog", "Refreshed token: " + refreshedToken);
    }
}
