package com.linkedlist.circularlinkedlist.roundrobin;

public class RoundRobin {
    ProcessNode head;

    void addProcess(int pid, int burst) {
        ProcessNode newNode = new ProcessNode(pid, burst);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    void display() {
        if (head == null) return;
        ProcessNode temp = head;
        do {
            System.out.println(temp.pid + " " + temp.burst);
            temp = temp.next;
        } while (temp != head);
    }
}

