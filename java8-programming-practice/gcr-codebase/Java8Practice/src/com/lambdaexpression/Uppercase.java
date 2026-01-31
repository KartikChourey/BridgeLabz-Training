package com.lambdaexpression;

import java.util.*;

public class Uppercase {
    public static void main(String[] args) {

        List<String> names = List.of("kartik", "rahul", "neha");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
