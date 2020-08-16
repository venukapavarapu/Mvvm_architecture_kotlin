package com.venu.mvvm_architecture_kotlin.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/data/api/ApiService;", "", "getUsers", "Lio/reactivex/Flowable;", "Lcom/venu/mvvm_architecture_kotlin/data/room/entities/User;", "login", "", "getVersions", "Lretrofit2/Response;", "Lcom/venu/mvvm_architecture_kotlin/data/VersionsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/logoin")
    public abstract io.reactivex.Flowable<com.venu.mvvm_architecture_kotlin.data.room.entities.User> getUsers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "login")
    java.lang.String login);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/android")
    public abstract java.lang.Object getVersions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.venu.mvvm_architecture_kotlin.data.VersionsResponse>> p0);
}