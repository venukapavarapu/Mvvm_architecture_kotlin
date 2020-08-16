package com.venu.mvvm_architecture_kotlin

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.venu.mvvm_architecture_kotlin.base.BaseActivity
import com.venu.mvvm_architecture_kotlin.models.VersionsResponse
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions
import com.venu.mvvm_architecture_kotlin.databinding.ActivityMainBinding
import com.venu.mvvm_architecture_kotlin.ui.acitivities.RvAdapter
import com.venu.mvvm_architecture_kotlin.ui.viewmodels.UserViewModel
import com.venu.mvvm_architecture_kotlin.viewmodels.ViewModelFactory
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var userViewModel: UserViewModel
    lateinit var rvAdapter: RvAdapter

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        userViewModel = ViewModelProviders.of(this, viewModelFactory).get(UserViewModel::class.java)
        binding.viewmodel = userViewModel

        rvAdapter = RvAdapter()

        userViewModel.popularMovies.observe(this, Observer { response ->
            when (response) {
                is Resource.Loading -> {
                    Log.e("data", "Loading")
                }
                is Resource.Error -> {
                    Log.e("data", "Error" + response.message)
                }
                is Resource.Success -> {
                    Log.e("data", "Success" + response.data)
                    setAdapterData(response.data)
                }
            }

        })

    }

    private fun setAdapterData(data: VersionsResponse?) {

        rv_versions.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = rvAdapter
        }
        rvAdapter.setItems(data)
    }
}
