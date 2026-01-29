package com.JSONdata.handsonpracticeproblems;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("name", "Kartik");
        json.put("age", 21);

        String xml = XML.toString(json, "student");
        System.out.println(xml);
    }
}
