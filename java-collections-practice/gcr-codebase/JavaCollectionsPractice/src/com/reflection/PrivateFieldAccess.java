package com.reflection;

import java.lang.reflect.Field;

class Person {
    private int age = 21;
}

public class PrivateFieldAccess {

    public static void main(String[] args) throws Exception {

     
        Person p = new Person();

     
        Class<?> clazz = p.getClass();

   
        Field field = clazz.getDeclaredField("age");

  
        field.setAccessible(true);

  
        field.set(p, 25);

     
        System.out.println("Updated Age: " + field.get(p));
    }
}

