package com.stackandqueue.slidingwindow;

public class SlidingWindowMain {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        SlidingWindowMax.findMax(arr, k);
    }
}