package com.linkedlist.circularlinkedlist.task;
public class TaskMain {
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask(1, "Coding", 1, "10-01");
        ts.addTask(2, "Testing", 2, "12-01");
        ts.displayTasks();
    }
}