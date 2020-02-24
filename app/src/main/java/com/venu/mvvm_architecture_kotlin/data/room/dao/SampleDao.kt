package com.venu.mvvm_architecture_kotlin.data.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.venu.mvvm_architecture_kotlin.data.room.entities.Sample
import com.venu.mvvm_architecture_kotlin.data.room.entities.User

@Dao
interface SampleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(sample: Sample) : Long
}