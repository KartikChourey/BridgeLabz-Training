package com.sortingalgorithms;

public class QuickSort {

    public static void main(String[] args) {

        int[] prices = {1200, 450, 800, 300, 999};
        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        for (int p : prices) {
            System.out.print(p + " ");
        }
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);   // left part
            quickSort(arr, pivotIndex + 1, high);  // right part
        }
    }

    // Partition method
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
