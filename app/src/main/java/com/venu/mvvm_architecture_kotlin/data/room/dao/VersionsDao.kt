package com.venu.mvvm_architecture_kotlin.data.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.venu.mvvm_architecture_kotlin.data.room.entities.User
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions

@Dao
interface VersionsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(versions : Versions)

    /*@Query("SELECT * FROM user WHERE login = :login")
    fun findByLogin(login: String): LiveData<User>*/
}
