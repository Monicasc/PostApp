package com.example.postapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.postapp.models.Post
import.ko.co.posts mvvm.models.Post

@Database(entities=arrayOf(Post::Class),version=1)
abstract class PostAppDatabase : RoomDatabase(){
    abstract fun postDao():PostDao

    companion object{
        private var dbInstance: PostAppDatabase?=null
        fun getDbInstance(context: Context):PostAppDatabase {
            if (dbInstance==null){
                dbInstance = Room.databaseBuilder(context, PostAppDatabase :: class.java "postappdb").build()
            }
            return dbInstance as PostAppDatabase
        }
    }
}
