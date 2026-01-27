package com.reflection;

class Student {
    Student() {
        System.out.println("Student object created!");
    }
}

public class DynamicObject {

    public static void main(String[] args) throws Exception {


        Class<?> clazz = Class.forName("Student");

 
        Object obj = clazz.getDeclaredConstructor().newInstance();
    }
}

