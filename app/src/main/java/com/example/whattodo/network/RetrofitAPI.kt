package com.example.whattodo.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitAPI {
//    10.0.2.2 앱에서
    private const val BASE_URL="http://3.39.24.10:8080"

    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val idCheckService : idCheckAPI = retrofit.create(idCheckAPI::class.java)
    val joinService : joinAPI=retrofit.create(joinAPI::class.java)
    val findService : findAPI= retrofit.create(findAPI::class.java)

}

