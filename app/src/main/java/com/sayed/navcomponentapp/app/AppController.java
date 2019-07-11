package com.sayed.navcomponentapp.app;

import android.app.Application;
import android.arch.lifecycle.ProcessLifecycleOwner;

public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new AppLifeCycle());
    }
}
