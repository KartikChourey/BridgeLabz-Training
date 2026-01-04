package com.linkedlist.circularlinkedlist.roundrobin;

public class ProcessNode {
    int pid, burst;
    ProcessNode next;

    ProcessNode(int pid, int burst) {
        this.pid = pid;
        this.burst = burst;
    }
}
