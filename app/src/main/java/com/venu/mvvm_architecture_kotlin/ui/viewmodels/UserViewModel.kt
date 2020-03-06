package com.venu.mvvm_architecture_kotlin.ui.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.venu.mvvm_architecture_kotlin.base.BaseViewModel
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions
import com.venu.mvvm_architecture_kotlin.ui.acitivities.UserRepository
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : BaseViewModel(){

      var versionsList : MutableLiveData<ArrayList<Versions>> = MutableLiveData()

    override fun start() {
        userRepository.takeText()
        userRepository.getData()
       // versionsList = userRepository.getVersions()!!
     //   userRepository.getVersions()!!.observe(this, androidx.lifecycle.Observer {  })
        userRepository.getVersions()!!.observeForever {
            Log.e("list", "" + it)
            versionsList.value=it
        }

    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}