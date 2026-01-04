package com.stackandqueue.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {

    static void findMax(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove elements out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k)
                dq.pollFirst();

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offerLast(i);

            // Print max once window is formed
            if (i >= k - 1)
                System.out.println(arr[dq.peekFirst()]);
        }
    }
}
