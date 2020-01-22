package com.czxbnb.flickr.models.post

import android.accounts.NetworkErrorException
import com.czxbnb.flickr.API_KEY
import com.czxbnb.flickr.api.PostApi
import com.czxbnb.flickr.base.BaseRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
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

    fun loadPostList(text: String, postCallback: PostCallback): Disposable {
        return postApi.getPosts("flickr.photos.search", API_KEY, text, "json", 1)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ result ->
                if (result != null)   {
                    postCallback.onLoadPostSuccess(result)
                } else {
                    postCallback.onLoadPostError(NetworkErrorException("Data not available"))
                }
            },
                { error -> postCallback.onLoadPostError(error) }
            )
    }
}