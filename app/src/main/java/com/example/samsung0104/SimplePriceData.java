package com.example.samsung0104;

public class SimplePriceData {
    public String name;
    public float price;
    public SimplePriceData(String name, float price) {
        this.name = name;
        this.price = 1f / price;
    }
}
