package com.searchingalgorithms.filereader;

import java.io.*;

public class Count {

    public static void main(String[] args) throws IOException {

        String targetWord = "java";
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }
        }

        br.close();
        System.out.println("Word Count: " + count);
    }
}

