package com.javastreams;

import java.io.*;
import java.util.*;

public class Count {

    public static void main(String[] args) throws Exception {

        // Reading text file
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));

   
        HashMap<String, Integer> wordCount = new HashMap<>();

        String line;

        // Reading file line by line
        while ((line = br.readLine()) != null) {

        
            String[] words = line.toLowerCase().split("\\W+");

            for (String word : words) {
                if (word.length() > 0) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }

        br.close();

        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " = " + list.get(i).getValue());
        }
    }
}
