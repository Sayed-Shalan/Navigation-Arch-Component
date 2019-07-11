package com.sayed.navcomponentapp.app;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class AppLifeCycle implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onAppStarts(){
        Log.e("APP LEVEL","ON START");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onAppStops(){
        Log.e("APP LEVEL","ON STOP");
    }
}
