package com.example.retrofit29032022;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Demo1> fetchDemo1();
}
