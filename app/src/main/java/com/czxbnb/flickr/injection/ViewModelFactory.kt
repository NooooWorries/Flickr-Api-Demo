package com.czxbnb.flickr.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.czxbnb.flickr.ui.MainViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> {
                return MainViewModel() as T
            }
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}