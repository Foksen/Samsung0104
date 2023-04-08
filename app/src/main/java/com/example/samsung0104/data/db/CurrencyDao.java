package com.example.samsung0104.data.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;

@Dao
public interface CurrencyDao {
    @Insert
    Completable addCurrency(SimplePriceData priceData);

    @Query("SELECT * from price_table")
    Observable<List<SimplePriceData>> getCurrencies();
}
