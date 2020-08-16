package com.venu.mvvm_architecture_kotlin.ui.acitivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/ui/acitivities/UserRepository;", "", "appExecutors", "Lcom/venu/mvvm_architecture_kotlin/di/modules/AppExecutors;", "apiService", "Lcom/venu/mvvm_architecture_kotlin/data/api/ApiService;", "versionsDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/VersionsDao;", "(Lcom/venu/mvvm_architecture_kotlin/di/modules/AppExecutors;Lcom/venu/mvvm_architecture_kotlin/data/api/ApiService;Lcom/venu/mvvm_architecture_kotlin/data/room/dao/VersionsDao;)V", "loadAllVersions", "Lretrofit2/Response;", "Lcom/venu/mvvm_architecture_kotlin/data/VersionsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class UserRepository {
    private final com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors appExecutors = null;
    private final com.venu.mvvm_architecture_kotlin.data.api.ApiService apiService = null;
    private final com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao versionsDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadAllVersions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.venu.mvvm_architecture_kotlin.data.VersionsResponse>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.data.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao versionsDao) {
        super();
    }
}