package com.zhen.dagger211demo.module;

import android.app.Activity;

import com.zhen.dagger211demo.MainActivity;
import com.zhen.dagger211demo.component.PersonComponent;
import com.zhen.dagger211demo.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

@Module//(subcomponents = {PersonComponent.class})
public abstract class BuildersModule {

    /*@Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectFactory(PersonComponent.Builder builder);*/


    @ActivityScope
    @ContributesAndroidInjector(modules = {PersonModule.class})
    abstract MainActivity contributesMainActivityInjector();
}
