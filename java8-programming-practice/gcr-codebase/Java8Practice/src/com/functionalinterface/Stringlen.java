package com.functionalinterface;

import java.util.function.Function;

public class Stringlen {
    public static void main(String[] args) {

        Function<String, Integer> getLength = msg -> msg.length();

        String message = "Hospital notification";

        System.out.println("Message length: " + getLength.apply(message));
    }
}
