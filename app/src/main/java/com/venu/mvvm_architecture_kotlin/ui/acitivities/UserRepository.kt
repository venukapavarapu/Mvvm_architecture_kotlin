package com.venu.mvvm_architecture_kotlin.ui.acitivities

import android.util.Log
import com.venu.mvvm_architecture_kotlin.data.api.ApiService
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao
import com.venu.mvvm_architecture_kotlin.data.room.entities.Sample
import com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val appExecutors: AppExecutors,
                                         private val userDao: UserDao,
                                         private val apiService: ApiService,
                                         private val sampleDao: SampleDao){

    fun takeText(){
        val sample=Sample("1","venu")
        appExecutors.diskIO().execute(Runnable {
            val result=sampleDao.insert(sample)
            Log.e("inserted","repo "+result)
        })
        Log.e("data","repo")
    }

}