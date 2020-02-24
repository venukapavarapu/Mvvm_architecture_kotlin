package com.venu.mvvm_architecture_kotlin.di.modules

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.kotlin.mvvm.boilerplate.di.qualifier.ApplicationContext
import com.venu.mvvm_architecture_kotlin.MyApp
import com.venu.mvvm_architecture_kotlin.data.api.ApiService
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao
import com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    @ApplicationContext
    abstract fun bindApplicationContext(application: MyApp): Context

    @Binds
    abstract fun bindApplication(application: MyApp): Application
}
