package com.streamapi;

import java.util.*;

public class StockLogger {
    public static void main(String[] args) {

        List<Double> prices = List.of(120.5, 121.8, 119.9);

        prices.forEach(price -> System.out.println("Price: " + price));
    }
}
