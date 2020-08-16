package com.venu.mvvm_architecture_kotlin.data.api

import com.venu.mvvm_architecture_kotlin.models.VersionsResponse
import com.venu.mvvm_architecture_kotlin.data.room.entities.User
import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("users/logoin")
    fun getUsers(@Path("login") login : String) : Flowable<User>

    /*@GET("api/android")
    fun getArticles(): Observable<List<Versions>>*/

    @GET("api/android")
    suspend fun getVersions(): Response<VersionsResponse>

}