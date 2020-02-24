package com.venu.mvvm_architecture_kotlin.data.room.db;

import java.lang.System;

@androidx.room.Database(entities = {com.venu.mvvm_architecture_kotlin.data.room.entities.User.class, com.venu.mvvm_architecture_kotlin.data.room.entities.Sample.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/data/room/db/DBHelper;", "Landroidx/room/RoomDatabase;", "()V", "sampleDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/SampleDao;", "userDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/UserDao;", "app_debug"})
public abstract class DBHelper extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao sampleDao();
    
    public DBHelper() {
        super();
    }
}