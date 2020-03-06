package com.venu.mvvm_architecture_kotlin.di.modules

import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.venu.mvvm_architecture_kotlin.MyApp
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao
import com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper
import com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper.Companion.MIGRATION_1_2
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DBModule {

    @Singleton
    @Provides
    internal fun provideDatabase(application: MyApp): DBHelper {
        return Room.databaseBuilder(application, DBHelper::class.java, "bl.db")
            .addMigrations(MIGRATION_1_2)
            .allowMainThreadQueries()
            .build()
    }

    /*val MIGRATION_3_4: Migration = object : Migration(3, 4) {
        override fun migrate(database: SupportSQLiteDatabase) { // Since we didn't alter the table, there's nothing else to do here.
        }
    }*/

    @Singleton
    @Provides
    fun provideUserDao(database: DBHelper): UserDao = database.userDao()

    @Singleton
    @Provides
    fun provideSampleDao(database: DBHelper) : SampleDao = database.sampleDao()

    @Singleton
    @Provides
    fun provideVersionsDao(database: DBHelper) : VersionsDao = database.versionsDao()
}