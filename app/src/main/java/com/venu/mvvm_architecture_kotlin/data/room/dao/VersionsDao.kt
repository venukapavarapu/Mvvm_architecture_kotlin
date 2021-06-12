package com.venu.mvvm_architecture_kotlin.data.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions
import kotlinx.coroutines.flow.Flow

@Dao
interface VersionsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(versions : List<Versions?>)

    @Query("SELECT * FROM versions")
    fun loadVersions(): Flow<List<Versions>>

    @Query("DELETE from versions")
    suspend fun deleteVersions()

    /*@Query("SELECT * FROM user WHERE login = :login")
    fun findByLogin(login: String): LiveData<User>*/
}
