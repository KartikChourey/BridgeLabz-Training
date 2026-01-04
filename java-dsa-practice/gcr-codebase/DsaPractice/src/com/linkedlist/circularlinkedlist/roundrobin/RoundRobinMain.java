package com.linkedlist.circularlinkedlist.roundrobin;

public class RoundRobinMain {
    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.display();
    }
}