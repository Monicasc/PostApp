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

    suspend fun getPosts() {
        val value: Any = withContext(context:Dispatchers. IO +NonCancellable
        return value
    }){
        val apiClient = ApiClient.buildService(ApiInterface::class.java)
        val response = apiClient.getPosts()
        if (response.isSuccessful) {
            val posts = response.body() as List<Post>
            savePosts(posts)
        }

    }
    return@withContext response

}

override fun writeToParcel(parcel: Parcel, flags: Int) {

}

override fun describeContents(): Int {
    return 0
}

companion object CREATOR : Parcelable.Creator<PostsRepository> {
    override fun createFromParcel(parcel: Parcel): PostsRepository {
        return PostsRepository(parcel)
    }

    override fun newArray(size: Int): Array<PostsRepository?> {
        return arrayOfNulls(size)
    }
}
}
