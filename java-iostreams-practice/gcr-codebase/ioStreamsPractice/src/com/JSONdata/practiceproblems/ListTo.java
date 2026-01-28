package com.JSONdata.practiceproblems;

import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListTo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Aman", 24));
        list.add(new Student("Riya", 26));

        StringBuilder json = new StringBuilder("[\n");

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            json.append("  { \"name\": \"").append(s.name)
                .append("\", \"age\": ").append(s.age).append(" }");

            if (i < list.size() - 1) json.append(",\n");
        }

        json.append("\n]");
        System.out.println(json);
    }
}
