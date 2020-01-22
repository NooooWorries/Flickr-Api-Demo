package com.czxbnb.flickr.api

import com.czxbnb.flickr.models.post.Post
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface PostApi {
    @GET("/services/rest")
    fun getPosts(
        @Query("method") method: String,
        @Query("api_key") apiKey: String,
        @Query("text") text: String,
        @Query("format") format: String,
        @Query("nojsoncallback") noJsonCallback: Int
    ): Observable<Post>
}