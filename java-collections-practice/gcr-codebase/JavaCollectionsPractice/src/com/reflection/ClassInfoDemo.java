package com.reflection;

import java.lang.reflect.*;

public class ClassInfoDemo {

    public static void main(String[] args) throws Exception {

        String className = "java.util.ArrayList";

  
        Class<?> clazz = Class.forName(className);

        System.out.println("Class Name: " + clazz.getName());

    
        System.out.println("\nMethods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

      
        System.out.println("\nFields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f.getName());
        }

    
        System.out.println("\nConstructors:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}
