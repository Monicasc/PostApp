package com.example.postapp.Database

interface postDao {
}@Query(value:"SELECT * FROM posts WHERE id = :postId")
    fun getPostById(postId: Int) LiveData<Post>

}