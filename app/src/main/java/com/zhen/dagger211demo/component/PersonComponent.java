package com.zhen.dagger211demo.component;

import com.zhen.dagger211demo.MainActivity;
import com.zhen.dagger211demo.module.PersonModule;
import com.zhen.dagger211demo.scope.ActivityScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = PersonModule.class)
public interface PersonComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}

}
