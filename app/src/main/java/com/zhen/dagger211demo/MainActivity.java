package com.zhen.dagger211demo;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhen.dagger211demo.bean.Person;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends DaggerAppCompatActivity {
    private static final String TAG = "MainActivity-vv";

    @Inject
    Person person;

    @Inject
    MyApplication application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: " + person.getName());

        if (application != null) {
            Log.d(TAG, "!=null");
        }
    }
}
