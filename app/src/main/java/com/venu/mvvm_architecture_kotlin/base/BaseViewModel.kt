package com.venu.mvvm_architecture_kotlin.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel(){
    abstract fun start()
    abstract fun stop()
}