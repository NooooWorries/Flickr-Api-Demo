package com.czxbnb.flickr.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.czxbnb.flickr.R
import com.czxbnb.flickr.base.BaseActivity
import com.czxbnb.flickr.databinding.ActivityMainBinding

class MainActivity: BaseActivity<MainViewModel, ActivityMainBinding>(MainViewModel::class.java) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding.viewModel = getActivityViewModel()

        getActivityViewModel()._postLiveData.observe(this, Observer { post->
            Log.d("---->" , post.photos.photo.size.toString())

        })
    }

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }
}