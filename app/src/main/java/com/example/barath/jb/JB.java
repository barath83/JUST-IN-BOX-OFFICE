package com.example.barath.jb;

import android.app.Application;

import com.firebase.client.Firebase;

public class JB extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
