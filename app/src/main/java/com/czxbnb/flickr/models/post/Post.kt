package com.czxbnb.flickr.models.post

import retrofit2.http.Field

data class Post(
    @Field("id")
    val id: String,

    @Field("owner")
    val owner: String,

    @Field("secret")
    val secret: String,

    @Field("server")
    val server: String,

    @Field("farm")
    val farm: Int,

    @Field("title")
    val title: String,

    @Field("ispublic")
    val isPublic: Int,

    @Field("isfriend")
    val isFriend: Int,

    @Field("isfamily")
    val isFamily: Int
)