package com.sortingalgorithms;

public class BubbleSort {

    public static void main(String[] args) {

        int[] marks = {78, 45, 90, 60, 82};

        // Bubble Sort logic
        for (int i = 0; i < marks.length - 1; i++) {

            // Flag to check if swapping happened
            boolean swapped = false;

            for (int j = 0; j < marks.length - 1 - i; j++) {

                // Compare adjacent elements
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping, array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("Sorted Student Marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
