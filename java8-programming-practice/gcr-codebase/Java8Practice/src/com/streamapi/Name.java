package com.streamapi;

import java.util.*;

public class Name {
    public static void main(String[] args) {

        List<String> names = List.of("kartik", "rahul", "aman");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
