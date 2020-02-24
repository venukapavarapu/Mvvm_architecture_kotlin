package com.venu.mvvm_architecture_kotlin.di.modules

import androidx.room.Room
import com.venu.mvvm_architecture_kotlin.MyApp
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao
import com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DBModule {

    @Singleton
    @Provides
    internal fun provideDatabase(application: MyApp): DBHelper {
        return Room.databaseBuilder(application, DBHelper::class.java, "bl.db")
            .allowMainThreadQueries()
            .build()
    }

    @Singleton
    @Provides
    fun provideUserDao(database: DBHelper): UserDao = database.userDao()

    @Singleton
    @Provides
    fun provideSampleDao(database: DBHelper) : SampleDao = database.sampleDao()
}