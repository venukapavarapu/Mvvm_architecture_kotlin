package com.venu.mvvm_architecture_kotlin.ui.acitivities

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.venu.mvvm_architecture_kotlin.data.api.ApiService
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao
import com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao
import com.venu.mvvm_architecture_kotlin.data.room.entities.Sample
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions
import com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserRepository @Inject constructor(private val appExecutors: AppExecutors,
                                         private val userDao: UserDao,
                                         private val apiService: ApiService,
                                         private val sampleDao: SampleDao,
                                         private val versionsDao: VersionsDao){

    var androidList: MutableLiveData<ArrayList<Versions>>?= MutableLiveData()

    fun takeText(){
        val sample=Sample("1","venu")
        appExecutors.diskIO().execute(Runnable {
            val result=sampleDao.insert(sample)
            Log.e("inserted","repo "+result)
        })
        Log.e("data","repo")
    }

    @SuppressLint("CheckResult")
    fun getData() {
        apiService.getArticles().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError { throwable ->
                Log.e("Error",throwable.message!!)
            }
            .subscribe({
                androidList?.value=ArrayList(it)
                Log.e("android", " " + it)
            })
    }

    fun getVersions(): LiveData<ArrayList<Versions>>? {
        return androidList
    }
}