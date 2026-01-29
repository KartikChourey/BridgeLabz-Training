package com.JSONdata.handsonpracticeproblems;

import org.json.JSONObject;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("email", "kartik@gmail.com");

        String email = json.getString("email");
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if(Pattern.matches(regex, email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
