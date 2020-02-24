package com.venu.mvvm_architecture_kotlin.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/di/modules/AppModule;", "", "()V", "bindApplication", "Landroid/app/Application;", "application", "Lcom/venu/mvvm_architecture_kotlin/MyApp;", "bindApplicationContext", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public abstract class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.kotlin.mvvm.boilerplate.di.qualifier.ApplicationContext()
    @dagger.Binds()
    public abstract android.content.Context bindApplicationContext(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.MyApp application);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.app.Application bindApplication(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.MyApp application);
    
    public AppModule() {
        super();
    }
}