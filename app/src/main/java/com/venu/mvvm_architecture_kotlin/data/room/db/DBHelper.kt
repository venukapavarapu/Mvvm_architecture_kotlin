package com.venu.mvvm_architecture_kotlin.data.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao
import com.venu.mvvm_architecture_kotlin.data.room.entities.Sample
import com.venu.mvvm_architecture_kotlin.data.room.entities.User

@Database(
    entities = [
        User::class,Sample::class],
    version = 3,
    exportSchema = false
)
abstract class DBHelper : RoomDatabase() {

    abstract fun userDao(): UserDao
     abstract fun sampleDao() : SampleDao
}
