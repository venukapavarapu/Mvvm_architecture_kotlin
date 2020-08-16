package com.venu.mvvm_architecture_kotlin.data.room.db;

import java.lang.System;

@androidx.room.Database(entities = {com.venu.mvvm_architecture_kotlin.data.room.entities.User.class, com.venu.mvvm_architecture_kotlin.data.room.entities.Sample.class, com.venu.mvvm_architecture_kotlin.data.room.entities.Versions.class}, version = 5, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/data/room/db/DBHelper;", "Landroidx/room/RoomDatabase;", "()V", "sampleDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/SampleDao;", "userDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/UserDao;", "versionsDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/VersionsDao;", "Companion", "app_debug"})
public abstract class DBHelper extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.venu.mvvm_architecture_kotlin.data.room.Migration1To2 MIGRATION_1_2 = null;
    public static final com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao sampleDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao versionsDao();
    
    public DBHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/data/room/db/DBHelper$Companion;", "", "()V", "MIGRATION_1_2", "Lcom/venu/mvvm_architecture_kotlin/data/room/Migration1To2;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}