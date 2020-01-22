package com.czxbnb.flickr.api

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
    )
}