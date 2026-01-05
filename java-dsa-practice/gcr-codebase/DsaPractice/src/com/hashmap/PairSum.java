package com.hashmap;

import java.util.HashSet;

public class PairSum {

    static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
    // Check that if set contains the given sum 
        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair Found: " + num + " & " + (target - num));
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int target = 10;

        System.out.println(hasPair(arr, target));
    }
}

