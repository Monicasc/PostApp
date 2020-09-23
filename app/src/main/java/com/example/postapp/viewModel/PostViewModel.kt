package com.example.postapp.viewModel

import java.util.prefs.PreferencesFactory


lateinit var  postviewModelFactory: PreferencesFactory

override fun onCreate(savedInstanceState: Bundle?)
super.onCreate(savedInstanceState)
        setContentView(R.layout.activiy_main)

        postsViewModelFactory = PostsViewModel