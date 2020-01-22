package com.czxbnb.flickr.base

import com.czxbnb.flickr.injection.component.DaggerRepositoryComponent
import com.czxbnb.flickr.injection.module.ApiModule
import com.czxbnb.flickr.injection.component.RepositoryComponent
import com.czxbnb.flickr.models.post.PostRepository

abstract class BaseRepository {
    private val component: RepositoryComponent = DaggerRepositoryComponent
        .builder()
        .apiModule(apiModule = ApiModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostRepository -> component.inject(this)
        }
    }
}