package com.searchingalgorithms.linearsearch;

public class SearchWord {

    public static void main(String[] args) {

        String[] sentences = {
            "Java is powerful",
            "Python is easy",
            "I love coding"
        };

        String word = "coding";
        String result = "Not Found";

        for (String s : sentences) {
            if (s.contains(word)) {
                result = s;
                break;
            }
        }

        System.out.println(result);
    }
}
