package com.venu.mvvm_architecture_kotlin.ui.acitivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/ui/acitivities/UserRepository;", "", "appExecutors", "Lcom/venu/mvvm_architecture_kotlin/di/modules/AppExecutors;", "userDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/UserDao;", "apiService", "Lcom/venu/mvvm_architecture_kotlin/data/api/ApiService;", "sampleDao", "Lcom/venu/mvvm_architecture_kotlin/data/room/dao/SampleDao;", "(Lcom/venu/mvvm_architecture_kotlin/di/modules/AppExecutors;Lcom/venu/mvvm_architecture_kotlin/data/room/dao/UserDao;Lcom/venu/mvvm_architecture_kotlin/data/api/ApiService;Lcom/venu/mvvm_architecture_kotlin/data/room/dao/SampleDao;)V", "takeText", "", "app_debug"})
@javax.inject.Singleton()
public final class UserRepository {
    private final com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors appExecutors = null;
    private final com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao userDao = null;
    private final com.venu.mvvm_architecture_kotlin.data.api.ApiService apiService = null;
    private final com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao sampleDao = null;
    
    public final void takeText() {
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.data.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao sampleDao) {
        super();
    }
}