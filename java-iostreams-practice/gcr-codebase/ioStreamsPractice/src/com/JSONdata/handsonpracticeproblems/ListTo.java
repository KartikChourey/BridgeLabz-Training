package com.JSONdata.handsonpracticeproblems;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;

class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ListTo {
    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User(1, "Kartik"),
                new User(2, "Rahul")
        );

        JSONArray array = new JSONArray();

        for(User u : list) {
            JSONObject obj = new JSONObject();
            obj.put("id", u.id);
            obj.put("name", u.name);
            array.put(obj);
        }

        System.out.println(array.toString(2));
    }
}
