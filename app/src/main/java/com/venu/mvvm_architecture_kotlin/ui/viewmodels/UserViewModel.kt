package com.venu.mvvm_architecture_kotlin.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.venu.mvvm_architecture_kotlin.Resource
import com.venu.mvvm_architecture_kotlin.models.VersionsResponse
import com.venu.mvvm_architecture_kotlin.ui.acitivities.UserRepository
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    var popularMovies: MutableLiveData<Resource<VersionsResponse>> = MutableLiveData()

    init {
        getAllversions()
    }

    fun getAllversions() = viewModelScope.launch {
          popularMovies.postValue(Resource.Loading())
          val response = userRepository.loadAllVersions()
        popularMovies.postValue(handleApiResponse(response))
    }

    private fun handleApiResponse(response: Response<VersionsResponse>): Resource<VersionsResponse>? {
        if(response.isSuccessful){
            response.body()?.let {
                res ->
                return Resource.Success(res)
            }
        }
        return Resource.Error(response.message())
    }
}