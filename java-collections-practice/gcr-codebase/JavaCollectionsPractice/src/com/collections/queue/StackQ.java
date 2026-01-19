package com.collections.queue;
import java.util.*;
class StackQ {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()) q2.add(q1.remove());
        Queue<Integer> temp = q1; q1 = q2; q2 = temp;
    }
    int pop() { return q1.remove(); }
}
