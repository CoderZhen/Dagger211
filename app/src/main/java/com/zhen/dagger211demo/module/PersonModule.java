package com.zhen.dagger211demo.module;

import com.zhen.dagger211demo.bean.Person;
import com.zhen.dagger211demo.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModule {

    @ActivityScope
    @Provides
    Person providesPerson(){
        Person person = new Person();
        person.setName("小红");
        person.setAge(22);
        return person;
    }

}
