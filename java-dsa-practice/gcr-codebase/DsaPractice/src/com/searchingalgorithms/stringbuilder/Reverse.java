package com.searchingalgorithms.stringbuilder;

public class Reverse {

    public static void main(String[] args) {

        String input = "hello";

        // Create StringBuilder and append string
        StringBuilder sb = new StringBuilder(input);

        // Reverse using built-in method
        sb.reverse();

        System.out.println("Reversed String: " + sb.toString());
    }
}
