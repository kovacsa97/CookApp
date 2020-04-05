package com.example.cookapp;

import android.app.Application;

public class App extends Application {

    public static AppComponent injector;

    @Override
    public void onCreate(){
        super.onCreate();

        injector = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}