package com.venu.mvvm_architecture_kotlin.data.api

import com.venu.mvvm_architecture_kotlin.data.room.entities.User
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("users/logoin")
    fun getUsers(@Path("login") login : String) : Flowable<User>
}