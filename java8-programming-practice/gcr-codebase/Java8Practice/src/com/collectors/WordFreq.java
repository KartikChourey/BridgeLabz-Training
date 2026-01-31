package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class WordFreq {
    public static void main(String[] args) {

        String text = "java stream java collector stream java";

        String[] words = text.split(" ");

        Map<String, Integer> frequency =
                Arrays.stream(words)
                      .collect(Collectors.toMap(
                              w -> w,
                              w -> 1,
                              Integer::sum
                      ));

        System.out.println(frequency);
    }
}
