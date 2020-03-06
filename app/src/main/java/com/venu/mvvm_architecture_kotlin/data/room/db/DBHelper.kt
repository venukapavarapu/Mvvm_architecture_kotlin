package com.venu.mvvm_architecture_kotlin.data.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.venu.mvvm_architecture_kotlin.data.room.Migration1To2
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao
import com.venu.mvvm_architecture_kotlin.data.room.entities.Sample
import com.venu.mvvm_architecture_kotlin.data.room.entities.User
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions


@Database(
    entities = [
        User::class,Sample::class,Versions::class],
    version = 5,
    exportSchema = false
)
abstract class DBHelper : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun sampleDao() : SampleDao
    abstract fun versionsDao() : VersionsDao

    companion object {
        @JvmField
        val MIGRATION_1_2 = Migration1To2()
    }

}
