package com.venu.mvvm_architecture_kotlin.di.modules

import com.venu.mvvm_architecture_kotlin.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityModule {

    @ContributesAndroidInjector()
    abstract fun contributeMainActivity(): MainActivity

}