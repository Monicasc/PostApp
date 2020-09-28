package com.example.postapp.Database

interface CommentsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertComment(comment: Comment)

    @Query(value: "SELECT * FROM comments")
    fun getComments(): LiveData<List<Comment>>

    @Query(value: "SELECT * FROM comments WHERE postId = postId")
    fun getCommentsByPostId(postId: Int): LiveData<List<Comment>>
}
