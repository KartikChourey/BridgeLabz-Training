package com.stackandqueue.stockspan;

import java.util.Stack;

public class StockSpan {

    static void calculateSpan(int[] price) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.println("Day 0 Span: 1");

        for (int i = 1; i < price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            int span = stack.isEmpty() ? i + 1 : i - stack.peek();
            System.out.println("Day " + i + " Span: " + span);
            stack.push(i);
        }
    }
}