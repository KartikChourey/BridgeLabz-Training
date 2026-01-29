package com.JSONdata.handsonpracticeproblems;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeJson {
    public static void main(String[] args) throws Exception {
        JSONObject j1 = new JSONObject(
                new String(Files.readAllBytes(Paths.get("a.json"))));
        JSONObject j2 = new JSONObject(
                new String(Files.readAllBytes(Paths.get("b.json"))));

        for(String key : j2.keySet()) {
            j1.put(key, j2.get(key));
        }

        System.out.println(j1.toString(2));
    }
}
