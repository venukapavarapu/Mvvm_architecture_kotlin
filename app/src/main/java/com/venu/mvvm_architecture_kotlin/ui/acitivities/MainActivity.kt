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
    lateinit var rvAdapter : RvAdapter

    val items by lazy {
        arrayListOf(
            Versions(1,"Android","Kotlin"),
            Versions(2,"Ios","Swift")
        )
    }


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        val binding : ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        userViewModel = ViewModelProviders.of(this, viewModelFactory).get(UserViewModel::class.java)
        binding.viewmodel=userViewModel
        userViewModel.start()

        rvAdapter=RvAdapter()
        rvAdapter.setItems(items)

        rv_versions.apply { layoutManager= LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter=rvAdapter
        }

        //rv_versions.also{it.setHasFixedSize(true) }

        userViewModel.versionsList.observe(this, Observer {

            rvAdapter.setItems(it)

            Log.e("name"," "+it.size)
            it?.let {
                it.stream().map { Log.e("name",it.name) }
            }

        })

    }
}
