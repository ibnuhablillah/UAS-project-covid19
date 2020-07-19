package com.example.covid19_mohibnuhablilah.retrofit

import android.renderscript.Sampler
import com.example.covid19_mohibnuhablilah.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("indonesia")
    fun getData(): Call<List<MainModel>>


}

