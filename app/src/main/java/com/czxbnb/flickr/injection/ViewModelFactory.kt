package com.czxbnb.flickr.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class ViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when {
//            modelClass.isAssignableFrom(QuestionViewModel::class.java) -> {
//                return QuestionViewModel() as T
//            }
//            modelClass.isAssignableFrom(SplashViewModel::class.java) -> {
//                return SplashViewModel() as T
//            }
//            modelClass.isAssignableFrom(HeadlineViewModel::class.java) -> {
//                return HeadlineViewModel() as T
//            }
//            modelClass.isAssignableFrom(ResultViewModel::class.java) -> {
//                return ResultViewModel() as T
//            }
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}