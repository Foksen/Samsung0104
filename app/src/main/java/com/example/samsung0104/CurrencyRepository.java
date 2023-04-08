package com.example.samsung0104;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyRepository {

    private static CurrencyAPI getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CurrencyAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(CurrencyAPI.class);
    }

    public static Observable<List<SimplePriceData>> getPriceData(String symbols, String base) {
        return getRetrofit().getPrice(symbols, base).map(PriceData::castToList);
    }
}
