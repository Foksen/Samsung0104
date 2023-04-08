package com.example.samsung0104;

import java.util.Arrays;
import java.util.List;

public class PriceData {
    public String base;
    public Rates rates;

    public class Rates {
        public float USD;
        public float EUR;
        public float CNY;
        public float INR;
        public float GBP;
    }

    public List<SimplePriceData> castToList() {
        return Arrays.asList(
                new SimplePriceData("USD", rates.USD),
                new SimplePriceData("EUR", rates.EUR),
                new SimplePriceData("CNY", rates.CNY),
                new SimplePriceData("INR", rates.INR),
                new SimplePriceData("GBP", rates.GBP)
        );
    }
}
