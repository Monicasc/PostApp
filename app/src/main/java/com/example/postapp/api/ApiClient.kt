package com.example.postapp.api

import com.example.postapp.models.Post
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    class ApiClient() : Parcelable {
        var client = OkHttpClient.Builder().build()
        var retrofit = Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        constructor(parcel: Parcel) : this() {

        }

        fun <T> buildService(service: Class<T>) {

        }


        override fun writeToParcel(parcel: Parcel, flags: Int) {

        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<ApiClient> {
            override fun createFromParcel(parcel: Parcel): ApiClient {
                return ApiClient(parcel)
            }

            override fun newArray(size: Int): Array<ApiClient?> {
                return arrayOfNulls(size)
            }
        }
    }

    fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    fun describeContents(): Int {
        return 0
    }

    object CREATOR : Parcelable.Creator<ApiClient> {
        override fun createFromParcel(parcel: Parcel): ApiClient {
            return ApiClient(parcel)
        }

        override fun newArray(size: Int): Array<ApiClient?> {
            return arrayOfNulls(size)
        }
    }