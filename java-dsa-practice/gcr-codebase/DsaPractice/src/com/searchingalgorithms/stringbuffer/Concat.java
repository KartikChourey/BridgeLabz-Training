package com.searchingalgorithms.stringbuffer;

public class Concat {

    public static void main(String[] args) {

        String[] words = {"Java", " ", "is", " ", "powerful"};

        StringBuffer buffer = new StringBuffer();

        // Efficient concatenation
        for (String word : words) {
            buffer.append(word);
        }

        System.out.println("Concatenated String: " + buffer.toString());
    }
}
