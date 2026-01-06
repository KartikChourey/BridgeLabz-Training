package com.sortingalgorithms;

public class SelectionSort{

    public static void main(String[] args) {

        int[] scores = {88, 72, 95, 60, 80};

        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.println("Sorted Exam Scores:");
        for (int s : scores) {
            System.out.print(s + " ");
        }
    }
}
