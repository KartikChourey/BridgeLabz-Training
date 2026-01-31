package com.streamapi;

import java.util.*;

public class Sensor {
    public static void main(String[] args) {

        List<Integer> readings = List.of(30, 55, 80, 45);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(r -> System.out.println("High Reading: " + r));
    }
}
