package com.venu.mvvm_architecture_kotlin.di.componet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/di/componet/AppComponent;", "", "inject", "", "app", "Lcom/venu/mvvm_architecture_kotlin/MyApp;", "Builder", "app_debug"})
@dagger.Component(modules = {com.venu.mvvm_architecture_kotlin.di.modules.ApiModule.class, com.venu.mvvm_architecture_kotlin.di.modules.DBModule.class, dagger.android.support.AndroidSupportInjectionModule.class, com.venu.mvvm_architecture_kotlin.di.modules.ViewModelModule.class, com.venu.mvvm_architecture_kotlin.di.modules.ActivityModule.class, com.venu.mvvm_architecture_kotlin.di.modules.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.MyApp app);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/di/componet/AppComponent$Builder;", "", "application", "Lcom/venu/mvvm_architecture_kotlin/MyApp;", "build", "Lcom/venu/mvvm_architecture_kotlin/di/componet/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.venu.mvvm_architecture_kotlin.di.componet.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.venu.mvvm_architecture_kotlin.MyApp application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.venu.mvvm_architecture_kotlin.di.componet.AppComponent build();
    }
}