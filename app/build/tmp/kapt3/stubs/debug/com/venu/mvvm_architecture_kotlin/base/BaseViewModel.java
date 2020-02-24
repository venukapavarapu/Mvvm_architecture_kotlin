package com.venu.mvvm_architecture_kotlin.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/venu/mvvm_architecture_kotlin/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "start", "", "stop", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    
    public abstract void start();
    
    public abstract void stop();
    
    public BaseViewModel() {
        super();
    }
}