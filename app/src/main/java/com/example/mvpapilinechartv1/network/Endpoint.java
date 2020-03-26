package com.example.mvpapilinechartv1.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Endpoint {
    @GET("charged_moves.json")
    Call<Object> getEndPoint(@Header("X-RapidAPI-Host") String rapidHost,
                             @Header("X-RapidAPI-Key") String rapidKey);
}
