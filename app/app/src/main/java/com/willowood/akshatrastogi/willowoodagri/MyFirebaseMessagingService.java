package com.willowood.akshatrastogi.willowoodagri;

import android.content.Intent;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Akshat Rastogi on 13-05-2018.
 */
public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d("mylog", "From: " + remoteMessage.getFrom());

        if (remoteMessage.getData().size() > 0) {
            Log.d("mylog", "Message data payload: " + remoteMessage.getData());
        }
        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d("mylog", "Body: " + remoteMessage.getNotification().getBody());
            Log.d("mylog", "Title: " + remoteMessage.getNotification().getTitle());
        }

        String message = remoteMessage.getData().get("message");
        Log.d("mylog", "Message Payload: " + message);

        Intent intent = new Intent(getApplicationContext(), LanguageActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra("message", message);
        getApplicationContext().startActivity(intent);

    }
}
