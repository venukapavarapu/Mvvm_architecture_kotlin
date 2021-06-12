package com.venu.mvvm_architecture_kotlin.ui.acitivities

import androidx.room.withTransaction
import com.venu.mvvm_architecture_kotlin.models.VersionsResponse
import com.venu.mvvm_architecture_kotlin.data.api.ApiService
import com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao
import com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions
import com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors
import com.venu.mvvm_architecture_kotlin.utils.Resource
import com.venu.mvvm_architecture_kotlin.utils.networkBoundResource
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserRepository @Inject constructor(private val appExecutors: AppExecutors,
                                         private val apiService: ApiService,
                                         private val db : DBHelper){

    private val versionsDao = db.versionsDao()

     fun loadAllVersions() : Flow<Resource<out List<Versions>>> = networkBoundResource(
        query = {
            versionsDao.loadVersions()
        },
        fetch = {
            val response=apiService.getVersions()
            response.versions
        },
        saveFetchResult = {
            db.withTransaction {
                versionsDao.deleteVersions()
                versionsDao.insert(it)
            }
        }
    )

}