package com.reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Kartik")
class DemoClass {
}

public class AnnotationReader {

    public static void main(String[] args) {

        Class<DemoClass> clazz = DemoClass.class;

        
        if (clazz.isAnnotationPresent(Author.class)) {

      
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        }
    }
}
