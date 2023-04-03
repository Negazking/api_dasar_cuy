package com.example.belajar_api_poke;

import retrofit2.Retrofit;

public class ApiClient {
    static Retrofit retrofit;
    static String BASE_URL = "https://jsonplaceholder.typicode.com/";


    public static Retrofit getRetrofitInstance(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).build();
        }
        return retrofit;
    }
}
