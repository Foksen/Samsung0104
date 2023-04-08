package com.example.samsung0104.data.db;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "price_table")
public class SimplePriceData {
    @NonNull
    @PrimaryKey
    public String name;
    public float price;
    public SimplePriceData(String name, float price) {
        this.name = name;
        this.price = 1f / price;
    }
}
