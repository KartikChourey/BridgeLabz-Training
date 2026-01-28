package com.JSONdata.practiceproblems;

import java.util.regex.*;

public class AgeFilter {

    public static void main(String[] args) {

        String json =
                "[{\"name\":\"Aman\",\"age\":24}," +
                "{\"name\":\"Riya\",\"age\":28}]";

        Pattern pattern = Pattern.compile("\\{.*?\"age\":\\s*(\\d+).*?\\}");
        Matcher matcher = pattern.matcher(json);

        while (matcher.find()) {
            int age = Integer.parseInt(matcher.group(1));
            if (age > 25) {
                System.out.println("Matched Record: " + matcher.group());
            }
        }
    }
}
