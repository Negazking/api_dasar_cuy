package com.example.belajar_api_poke;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("users/4")
    Call<ResponseBody> getDetailUser();

}
