package com.example.covid19_mohibnuhablilah.retrofit

import android.telecom.Call
import com.example.covid19_mohibnuhablilah.MainModel

class ApiEndpoint {

    @GET( value: "indonesia")
    fun getData(): Call<List<MainModel>>

}

