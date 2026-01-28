package com.JSONdata.practiceproblems;

import java.io.*;
import java.util.regex.*;

public class JsonField {

    public static void main(String[] args) throws Exception {

    
        BufferedReader br = new BufferedReader(new FileReader("user.json"));
        StringBuilder json = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            json.append(line);
        }
        br.close();

        String content = json.toString();

       
        Pattern namePattern = Pattern.compile("\"name\"\\s*:\\s*\"(.*?)\"");
        Pattern emailPattern = Pattern.compile("\"email\"\\s*:\\s*\"(.*?)\"");

        Matcher nameMatcher = namePattern.matcher(content);
        Matcher emailMatcher = emailPattern.matcher(content);

        if (nameMatcher.find())
            System.out.println("Name: " + nameMatcher.group(1));

        if (emailMatcher.find())
            System.out.println("Email: " + emailMatcher.group(1));
    }
}
