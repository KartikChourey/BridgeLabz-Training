package com.hashmap;

import java.util.*;

public class zerosum {

    static void findSubarrays(int[] arr) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Sum 0 at index -1 (for subarrays starting from index 0)
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray from " + (start + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, -4};
        findSubarrays(arr);
    }
}

