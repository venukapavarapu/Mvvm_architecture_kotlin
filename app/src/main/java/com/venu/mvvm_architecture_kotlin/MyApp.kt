package com.venu.mvvm_architecture_kotlin

import android.app.Application
import com.venu.mvvm_architecture_kotlin.di.componet.AppComponent
import com.venu.mvvm_architecture_kotlin.di.componet.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApp : Application(),HasAndroidInjector{

    @Inject lateinit var androidInjector : DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
        //androidInjector()
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

}