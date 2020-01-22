package com.czxbnb.flickr.models.post

import com.czxbnb.flickr.api.PostApi
import com.czxbnb.flickr.base.BaseRepository
import javax.inject.Inject

class PostRepository : BaseRepository() {
    @Inject
    lateinit var postApi: PostApi

    companion object {
        @Volatile
        private lateinit var instance: PostRepository

        fun getInstance(): PostRepository {
            if (!::instance.isInitialized) {
                synchronized(PostRepository::class.java) {
                    if (!::instance.isInitialized) {
                        instance = PostRepository()
                    }
                }
            }
            return instance
        }
    }

}