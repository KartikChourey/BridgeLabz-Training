package com.reflection;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class PrivateMethodInvoke {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

    
        Class<?> clazz = calc.getClass();


        Method method = clazz.getDeclaredMethod("multiply", int.class, int.class);

  
        method.setAccessible(true);


        int result = (int) method.invoke(calc, 4, 5);

        System.out.println("Result: " + result);
    }
}
