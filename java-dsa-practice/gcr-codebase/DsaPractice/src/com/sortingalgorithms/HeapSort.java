package com.sortingalgorithms;

public class HeapSort {

    public static void main(String[] args) {

        int[] salaries = {60000, 45000, 80000, 30000, 70000};

        int n = salaries.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            heapify(salaries, i, 0);
        }

        System.out.println("Sorted Salary Demands:");
        for (int s : salaries) {
            System.out.print(s + " ");
        }
    }

    // Heapify method
    static void heapify(int[] arr, int size, int root) {

        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }
}
