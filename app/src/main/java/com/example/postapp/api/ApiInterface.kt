package com.example.postapp.api

import com.example.postapp.models.Post
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    interface ApiInterface {
        @GET("posts")
        fun getPosts(): Response<List<Post>>
        @GET(value = "posts/{post_id}/comments")
        suspend fun getComments(@path(values: "post_id") postId: Int):Response<List<Post>>
    }