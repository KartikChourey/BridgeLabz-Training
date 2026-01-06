package com.searchingalgorithms.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String input = "programming";
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Traverse characters
        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        System.out.println("Without Duplicates: " + result.toString());
    }
}

