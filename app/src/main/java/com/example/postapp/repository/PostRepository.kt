package com.example.postapp.repository

import android.os.Parcel
import android.os.Parcelable
import com.example.postapp.api.ApiClient
import com.example.postapp.api.ApiInterface
import com.example.postapp.models.Post
import com.facebook.stetho.inspector.protocol.module.Network
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.withContext
import retrofit2.Response


class PostsRepository private constructor() {

    class PostsRepository {
        suspend fun getPosts() = withContext(Dispatchers.IO) {
            val coroutineScope =
            //this; CoroutineScope
            val apiInterface = ApiInterface.buildService(ApiInterface::class.java)
            val response = apiInterface.getPosts()
            if (response.isSuccessful) {
                val posts = response.body() as List<Post>
                savePosts(Posts)
            }
            return@withContext response
        }

        suspend fun savePosts(postsList: List<Post>) = withContext() Dis
        val database = PostAppDatabase.getDbInstance(PostsApp.appContext)
        postsList.forEach { post ->
            database.postDao().insertPost(post)
        }
    }

    fun getDbPosts(): LiveData<List<Posts>> {
        val database = PostAppDatabase.getDbInstance(PostsApp.appContext)
        return database.postDao().getPosts()
    }
    fun getPostsById(postId: Int): LiveData<Post>{
        val database =PostAppDatabase.getDbInstance(PostsApp.appContext)
        return database.postDao().getPOstById(postId)

    }