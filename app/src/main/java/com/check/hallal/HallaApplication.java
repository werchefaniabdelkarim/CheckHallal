package com.check.hallal;

import android.app.Application;

import io.realm.Realm;

public class HallaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}