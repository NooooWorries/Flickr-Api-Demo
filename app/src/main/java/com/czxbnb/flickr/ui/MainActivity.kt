package com.czxbnb.flickr.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.czxbnb.flickr.R
import com.czxbnb.flickr.base.BaseActivity
import com.czxbnb.flickr.databinding.ActivityMainBinding

/**
 * Remarks: This aictivity bind with viewModel
 * Thus, the data won't reload even if I didn't implement onSaveInstance()
 * The viewmodel won't execute onCreate() again even if the orientaion changed
 */
class MainActivity: BaseActivity<MainViewModel, ActivityMainBinding>(MainViewModel::class.java) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding.viewModel = getActivityViewModel()
        dataBinding.rvPhotos.layoutManager =
            LinearLayoutManager (this, LinearLayoutManager.VERTICAL, false)
    }

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }
}