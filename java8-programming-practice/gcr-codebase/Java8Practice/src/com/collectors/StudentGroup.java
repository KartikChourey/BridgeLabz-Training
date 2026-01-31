package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGroup{
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Kartik", "A"),
                new Student("Rahul", "B"),
                new Student("Neha", "A")
        );

        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                s -> s.grade,
                                Collectors.mapping(s -> s.name, Collectors.toList())
                        ));

        System.out.println(result);
    }
}
