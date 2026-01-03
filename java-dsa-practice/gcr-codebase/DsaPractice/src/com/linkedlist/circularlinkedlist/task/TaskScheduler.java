package com.linkedlist.circularlinkedlist.task;

class TaskScheduler {
    TaskNode head;

    void addTask(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    void displayTasks() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}
