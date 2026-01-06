package com.sortingalgorithms;

public class MergeSort{

    public static void main(String[] args) {

        int[] prices = {450, 299, 999, 150, 799};
        mergeSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Book Prices:");
        for (int p : prices) {
            System.out.print(p + " ");
        }
    }

    // Recursive merge sort
    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);       // sort left half
            mergeSort(arr, mid + 1, right);  // sort right half

            merge(arr, left, mid, right);    // merge both halves
        }
    }

    // Merge two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }
}

