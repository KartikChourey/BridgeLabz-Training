package com.linkedlist.circularlinkedlist.task;

public class TaskNode {
    int id, priority;
    String name, dueDate;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}