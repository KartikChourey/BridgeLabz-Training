package com.functionalinterface;

import java.util.function.Predicate;

public class Temperature {
    public static void main(String[] args) {

        Predicate<Double> alert = temp -> temp > 38;

        double temperature = 39.5;

        if (alert.test(temperature)) {
            System.out.println("High Temperature Alert");
        }
    }
}
