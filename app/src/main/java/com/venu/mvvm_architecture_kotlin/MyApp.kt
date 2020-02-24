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

  /*  private lateinit var androidInjector: AndroidInjector<out DaggerApplication>

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = androidInjector*/

    /*@Inject
    lateinit var _androidInjector: AndroidInjector<Any>
    override fun androidInjector() = _androidInjector*/

    private var myComponent: AppComponent? = null

    @Inject lateinit var androidInjector : DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
        //androidInjector()
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

}