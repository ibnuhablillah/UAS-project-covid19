package com.example.covid19_mohibnuhablilah.retrofit

import android.renderscript.Sampler
import android.telecom.Call
import com.example.covid19_mohibnuhablilah.MainModel
import retrofit2.http.GET

interface ApiEndpoint {

    @GET(value = "indonesia")
    fun getData(): Call<List<MainModel>>

}

