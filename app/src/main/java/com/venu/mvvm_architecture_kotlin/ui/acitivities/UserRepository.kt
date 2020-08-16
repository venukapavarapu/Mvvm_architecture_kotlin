package com.venu.mvvm_architecture_kotlin.ui.acitivities

import com.venu.mvvm_architecture_kotlin.models.VersionsResponse
import com.venu.mvvm_architecture_kotlin.data.api.ApiService
import com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao
import com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserRepository @Inject constructor(private val appExecutors: AppExecutors,
                                         private val apiService: ApiService,
                                         private val versionsDao: VersionsDao){


/*
    fun loadAllVersions(): LiveData<Resource<List<Versions?>?>?>? {
        return object :
            NetworkBoundResource<List<Versions?>?, List<Versions?>?>() {
            override fun saveCallResult(item: List<Versions?>) {
                versionsDao.insert(item)
            }

            override fun loadFromDb(): LiveData<List<Versions?>?> {
                return versionsDao.loadVersions()
            }

            override fun createCall(): Call<List<Versions?>?> {
                return apiService.getVersions()
            }

            override fun shouldFetch(data: List<Versions?>?): Boolean = true
        }.asLiveData
    }
*/


    suspend fun loadAllVersions() : Response<VersionsResponse> =
        apiService.getVersions()

}