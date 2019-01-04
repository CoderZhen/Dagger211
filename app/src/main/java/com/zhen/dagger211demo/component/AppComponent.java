package com.zhen.dagger211demo.component;

import com.zhen.dagger211demo.MyApplication;
import com.zhen.dagger211demo.module.AppModule;
import com.zhen.dagger211demo.module.BuildersModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AppModule.class,
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        BuildersModule.class
})
interface AppComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {}

}
