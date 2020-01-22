package com.czxbnb.flickr.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.czxbnb.flickr.base.BaseViewModel
import com.czxbnb.flickr.models.post.Post
import com.czxbnb.flickr.models.post.PostCallback
import com.czxbnb.flickr.models.post.PostRepository
import javax.inject.Inject

class MainViewModel : BaseViewModel() {
    @Inject
    lateinit var postRepository: PostRepository

    // Live data for post list
    private val postLiveData: MutableLiveData<Post> = MutableLiveData()
    val _postLiveData : LiveData<Post> = postLiveData

    // Photo adapter
    val photoRecyclerViewAdapter: PhotoRecyclerViewAdapter = PhotoRecyclerViewAdapter()

    init {
        getPosts()
    }

    private fun getPosts () {
        postRepository.loadPostList("kitten", object: PostCallback {
            override fun onLoadPostSuccess(post: Post) {
                postLiveData.value = post
                photoRecyclerViewAdapter.updatePhotoList(post.photos.photo)
            }

            override fun onLoadPostError(e: Throwable) {
               errorMessage.value = e.message
            }
        })
    }
}