package com.czxbnb.flickr.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.czxbnb.flickr.injection.component.DaggerViewModelComponent
import com.czxbnb.flickr.injection.component.ViewModelComponent
import com.czxbnb.flickr.injection.module.RepositoryModule
import com.czxbnb.flickr.ui.MainViewModel
import java.net.ConnectException

abstract class BaseViewModel : ViewModel() {
    private val component: ViewModelComponent = DaggerViewModelComponent
        .builder()
        .repositoryModule(RepositoryModule)
        .build()

    val errorMessage: MutableLiveData<String> = MutableLiveData()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is MainViewModel -> component.inject(this)
        }
    }

    fun onErrorOccurred(e: Throwable) {
        if (e is ConnectException){
            errorMessage.value = "Please check your network"
        } else {
            errorMessage.value = "Unknown error occurred, please try again later."
        }
    }
}