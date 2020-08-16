package com.venu.mvvm_architecture_kotlin.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/ui/viewmodels/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/venu/mvvm_architecture_kotlin/ui/acitivities/UserRepository;", "(Lcom/venu/mvvm_architecture_kotlin/ui/acitivities/UserRepository;)V", "popularMovies", "Landroidx/lifecycle/MutableLiveData;", "Lcom/venu/mvvm_architecture_kotlin/Resource;", "Lcom/venu/mvvm_architecture_kotlin/data/VersionsResponse;", "getPopularMovies", "()Landroidx/lifecycle/MutableLiveData;", "setPopularMovies", "(Landroidx/lifecycle/MutableLiveData;)V", "getAllversions", "Lkotlinx/coroutines/Job;", "handleApiResponse", "response", "Lretrofit2/Response;", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.venu.mvvm_architecture_kotlin.Resource<com.venu.mvvm_architecture_kotlin.data.VersionsResponse>> popularMovies;
    private final com.venu.mvvm_architecture_kotlin.ui.acitivities.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.venu.mvvm_architecture_kotlin.Resource<com.venu.mvvm_architecture_kotlin.data.VersionsResponse>> getPopularMovies() {
        return null;
    }
    
    public final void setPopularMovies(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.venu.mvvm_architecture_kotlin.Resource<com.venu.mvvm_architecture_kotlin.data.VersionsResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllversions() {
        return null;
    }
    
    private final com.venu.mvvm_architecture_kotlin.Resource<com.venu.mvvm_architecture_kotlin.data.VersionsResponse> handleApiResponse(retrofit2.Response<com.venu.mvvm_architecture_kotlin.data.VersionsResponse> response) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.ui.acitivities.UserRepository userRepository) {
        super();
    }
}