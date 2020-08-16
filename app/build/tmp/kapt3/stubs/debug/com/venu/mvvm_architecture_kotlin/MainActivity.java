package com.venu.mvvm_architecture_kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0015J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006#"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/MainActivity;", "Lcom/venu/mvvm_architecture_kotlin/base/BaseActivity;", "()V", "items", "Ljava/util/ArrayList;", "Lcom/venu/mvvm_architecture_kotlin/data/room/entities/Versions;", "getItems", "()Ljava/util/ArrayList;", "items$delegate", "Lkotlin/Lazy;", "rvAdapter", "Lcom/venu/mvvm_architecture_kotlin/ui/acitivities/RvAdapter;", "getRvAdapter", "()Lcom/venu/mvvm_architecture_kotlin/ui/acitivities/RvAdapter;", "setRvAdapter", "(Lcom/venu/mvvm_architecture_kotlin/ui/acitivities/RvAdapter;)V", "userViewModel", "Lcom/venu/mvvm_architecture_kotlin/ui/viewmodels/UserViewModel;", "getUserViewModel", "()Lcom/venu/mvvm_architecture_kotlin/ui/viewmodels/UserViewModel;", "setUserViewModel", "(Lcom/venu/mvvm_architecture_kotlin/ui/viewmodels/UserViewModel;)V", "viewModelFactory", "Lcom/venu/mvvm_architecture_kotlin/viewmodels/ViewModelFactory;", "getViewModelFactory", "()Lcom/venu/mvvm_architecture_kotlin/viewmodels/ViewModelFactory;", "setViewModelFactory", "(Lcom/venu/mvvm_architecture_kotlin/viewmodels/ViewModelFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setAdapterData", "data", "Lcom/venu/mvvm_architecture_kotlin/data/VersionsResponse;", "app_debug"})
public final class MainActivity extends com.venu.mvvm_architecture_kotlin.base.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.venu.mvvm_architecture_kotlin.viewmodels.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.venu.mvvm_architecture_kotlin.ui.viewmodels.UserViewModel userViewModel;
    @org.jetbrains.annotations.NotNull()
    public com.venu.mvvm_architecture_kotlin.ui.acitivities.RvAdapter rvAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy items$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.venu.mvvm_architecture_kotlin.viewmodels.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.viewmodels.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.venu.mvvm_architecture_kotlin.ui.viewmodels.UserViewModel getUserViewModel() {
        return null;
    }
    
    public final void setUserViewModel(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.ui.viewmodels.UserViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.venu.mvvm_architecture_kotlin.ui.acitivities.RvAdapter getRvAdapter() {
        return null;
    }
    
    public final void setRvAdapter(@org.jetbrains.annotations.NotNull()
    com.venu.mvvm_architecture_kotlin.ui.acitivities.RvAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.venu.mvvm_architecture_kotlin.data.room.entities.Versions> getItems() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setAdapterData(com.venu.mvvm_architecture_kotlin.data.VersionsResponse data) {
    }
    
    public MainActivity() {
        super();
    }
}