package com.JSONdata.practiceproblems;


public class CreateJSON {

 public static void main(String[] args) {

     
     String name = "Kartik";
     int age = 22;
     String[] subjects = {"Java", "DSA", "AI"};

     StringBuilder json = new StringBuilder();

     json.append("{\n");
     json.append("  \"name\": \"").append(name).append("\",\n");
     json.append("  \"age\": ").append(age).append(",\n");
     json.append("  \"subjects\": [");

 
     for (int i = 0; i < subjects.length; i++) {
         json.append("\"").append(subjects[i]).append("\"");
         if (i < subjects.length - 1) json.append(", ");
     }

     json.append("]\n}");
     
    
     System.out.println(json);
 }
}

