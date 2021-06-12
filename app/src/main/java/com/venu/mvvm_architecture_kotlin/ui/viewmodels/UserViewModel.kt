package com.venu.mvvm_architecture_kotlin.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.venu.mvvm_architecture_kotlin.ui.acitivities.UserRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    val versions=userRepository.loadAllVersions()
        .stateIn(viewModelScope, SharingStarted.Lazily,null)
}