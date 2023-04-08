package com.example.samsung0104.data.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {SimplePriceData.class}, version = 1)
abstract public class CurrencyDB extends RoomDatabase {

    private static CurrencyDB instance;

    public abstract CurrencyDao currencyDao();

    public static CurrencyDB getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    CurrencyDB.class, "currency").build();
        }
        return instance;
    }
}
