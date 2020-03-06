package com.venu.mvvm_architecture_kotlin.data.api

import com.venu.mvvm_architecture_kotlin.data.room.entities.User
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("users/logoin")
    fun getUsers(@Path("login") login : String) : Flowable<User>

    @GET("api/android")
    fun getArticles(): Observable<List<Versions>>
}