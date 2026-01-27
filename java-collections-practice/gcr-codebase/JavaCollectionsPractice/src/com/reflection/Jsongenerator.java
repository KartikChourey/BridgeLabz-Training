package com.reflection;

import java.lang.reflect.Field;

class Product {
    String name = "Laptop";
    int price = 60000;
}

public class Jsongenerator {

    public static void main(String[] args) throws Exception {

        Product p = new Product();
        Class<?> clazz = p.getClass();

        StringBuilder json = new StringBuilder("{");

        for (Field f : clazz.getDeclaredFields()) {
            f.setAccessible(true);
            json.append("\"").append(f.getName()).append("\": ")
                .append("\"").append(f.get(p)).append("\", ");
        }

   
        json.setLength(json.length() - 2);
        json.append("}");

        System.out.println(json);
    }
}
