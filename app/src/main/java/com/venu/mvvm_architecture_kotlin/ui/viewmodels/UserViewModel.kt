package com.venu.mvvm_architecture_kotlin.ui.viewmodels

import com.venu.mvvm_architecture_kotlin.base.BaseViewModel
import com.venu.mvvm_architecture_kotlin.ui.acitivities.UserRepository
import javax.inject.Inject

class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : BaseViewModel(){

    override fun start() {
        userRepository.takeText()
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}