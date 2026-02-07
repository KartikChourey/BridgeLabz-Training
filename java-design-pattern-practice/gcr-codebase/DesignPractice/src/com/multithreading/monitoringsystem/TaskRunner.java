package com.multithreading.monitoringsystem;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class TaskRunner extends Thread {
    TaskRunner(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(2000);
            for (int i = 0; i < 1000000; i++) { }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class StateMonitor extends Thread {
    TaskRunner[] tasks;
    Set<String> states = new HashSet<>();

    StateMonitor(TaskRunner[] tasks) {
        this.tasks = tasks;
    }

    public void run() {
        boolean running = true;
        while (running) {
            running = false;
            for (TaskRunner task : tasks) {
                Thread.State state = task.getState();
                states.add(task.getName() + ":" + state);
                System.out.println("[Monitor] " + task.getName() +
                        " is in " + state +
                        " at " + LocalTime.now());
                if (state != Thread.State.TERMINATED) {
                    running = true;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Summary:");
        for (String s : states) {
            System.out.println(s);
        }
    }
}


