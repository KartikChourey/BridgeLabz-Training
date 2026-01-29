package com.JSONdata.handsonpracticeproblems;
import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJson {
    public static void main(String[] args) {
        String jsonStr = """
            [
              {"name":"A", "age":22},
              {"name":"B", "age":30},
              {"name":"C", "age":28}
            ]
        """;

        JSONArray arr = new JSONArray(jsonStr);

        for(int i=0; i<arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            if(obj.getInt("age") > 25) {
                System.out.println(obj);
            }
        }
    }
}
