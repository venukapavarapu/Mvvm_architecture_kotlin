package com.venu.mvvm_architecture_kotlin.di.componet

import com.venu.mvvm_architecture_kotlin.MyApp
import com.venu.mvvm_architecture_kotlin.di.modules.*
import com.venu.mvvm_architecture_kotlin.di.modules.ActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class,
    DBModule::class,
    AndroidSupportInjectionModule::class,
    ViewModelModule::class,
    ActivityModule::class,
    AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application : MyApp) : Builder

        fun build():AppComponent
    }

    fun inject(app : MyApp)
}