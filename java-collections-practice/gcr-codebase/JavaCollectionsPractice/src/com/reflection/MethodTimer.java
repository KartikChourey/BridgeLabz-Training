package com.reflection;

import java.lang.reflect.Method;

class Task {
    public void doWork() throws InterruptedException {
        Thread.sleep(500);
    }
}

public class MethodTimer {

    public static void main(String[] args) throws Exception {

        Task task = new Task();
        Method method = task.getClass().getMethod("doWork");

        long start = System.currentTimeMillis();

        // Executing method dynamically
        method.invoke(task);

        long end = System.currentTimeMillis();

        System.out.println("Execution Time: " + (end - start) + " ms");
    }
}
