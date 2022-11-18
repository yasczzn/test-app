package com.example.testapp.API

import com.example.testapp.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface Api {

    interface Api {

        @GET("user")
        @Headers("country: id")
        suspend fun getUser(): Call<ArrayList<User>>
    }

}