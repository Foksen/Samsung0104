package com.example.samsung0104.data.network;

import com.example.samsung0104.data.network.PriceData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface CurrencyAPI {
    String BASE_URL = "https://apilayer.com";

    @Headers("apikey: vhnbUmuobFNoAydN39m091yogoXkpprb")
    @GET("/exchangerates_data/latest")
    Observable<PriceData> getPrice(
            @Query("symbols") String symbols,
            @Query("base") String base
    );
}
