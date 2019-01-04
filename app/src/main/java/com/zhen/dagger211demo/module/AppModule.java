package com.zhen.dagger211demo.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.zhen.dagger211demo.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    Context providesContext(MyApplication application){
        return application;
    }

    @Singleton
    @Provides
    SharedPreferences providesPreferences(MyApplication application){
        return application.getSharedPreferences("date_name", Context.MODE_PRIVATE);
    }

}
