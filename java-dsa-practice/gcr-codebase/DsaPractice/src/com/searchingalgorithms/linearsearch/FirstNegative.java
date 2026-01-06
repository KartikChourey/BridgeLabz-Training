package com.searchingalgorithms.linearsearch;

public class FirstNegative {

    public static void main(String[] args) {

        int[] arr = {5, 2, 3, -4, 6};

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}
