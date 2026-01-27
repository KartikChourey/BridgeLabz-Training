package com.reflection;

import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello World!");
    }
}

public class LoggingProxy {

    public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                original.getClass().getClassLoader(),
                new Class[]{Greeting.class},
                (obj, method, args1) -> {

                    System.out.println("Calling method: " + method.getName());
                    return method.invoke(original, args1);
                });

        proxy.sayHello();
    }
}
