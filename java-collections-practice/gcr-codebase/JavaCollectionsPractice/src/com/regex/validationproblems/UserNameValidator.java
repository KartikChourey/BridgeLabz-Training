package com.regex.validationproblems;

import java.util.regex.*;

public class UserNameValidator {
    public static void main(String[] args) {

      
        String username = "user_123";

     
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

       
        Pattern pattern = Pattern.compile(regex);

      
        Matcher matcher = pattern.matcher(username);

        System.out.println(matcher.matches() ? "Valid" : "Invalid");
        String plate = "AB1234";

    
     System.out.println(plate.matches("^[A-Z]{2}[0-9]{4}$"));
     String color = "#FFA500";


  System.out.println(color.matches("^#[0-9A-Fa-f]{6}$"));


     
    }
}
