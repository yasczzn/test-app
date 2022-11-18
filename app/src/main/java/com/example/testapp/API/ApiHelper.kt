package com.example.testapp.API

class ApiHelper(private val api: Api) {

    suspend fun getNews() = api.getNews()
}