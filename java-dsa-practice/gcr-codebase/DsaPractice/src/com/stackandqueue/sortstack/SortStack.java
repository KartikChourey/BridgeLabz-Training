package com.stackandqueue.sortstack;

import java.util.Stack;

public class SortStack {

    // Sort stack using recursion
    static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sort(stack);
            insertInSortedOrder(stack, top);
        }
    }

    // Insert element at correct position
    static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, value);
        stack.push(temp);
    }
}

