package com.venu.mvvm_architecture_kotlin.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/di/modules/DBModule;", "", "()V", "provideDatabase", "Lcom/venu/mvvm_architecture_kotlin/data/room/db/DBHelper;", "application", "Lcom/venu/mvvm_architecture_kotlin/MyApp;", "provideDatabase$app_debug", "provideSampleDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/SampleDao;", "database", "provideUserDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/UserDao;", "app_debug"})
@dagger.Module()
public final class DBModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper provideDatabase$app_debug(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.MyApp application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao provideSampleDao(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper database) {
        return null;
    }
    
    public DBModule() {
        super();
    }
}