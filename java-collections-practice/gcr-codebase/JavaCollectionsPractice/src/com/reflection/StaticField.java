package com.reflection;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class StaticField {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Configuration.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_SECRET_KEY");

        System.out.println("Updated API Key: " + field.get(null));
    }
}
