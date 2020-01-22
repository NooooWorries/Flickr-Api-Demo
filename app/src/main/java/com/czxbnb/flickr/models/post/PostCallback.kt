package com.czxbnb.flickr.models.post

interface PostCallback {
    fun onLoadPostSuccess(post: Post)

    fun onLoadPostError(e: Throwable)
}