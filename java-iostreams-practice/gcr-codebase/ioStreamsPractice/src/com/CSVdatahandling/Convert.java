package com.CSVdatahandling;

import java.io.*;
import java.util.*;

class Student {
    int id;
    String name;
    int age;
    int marks;

    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }
}

public class Convert {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        List<Student> list = new ArrayList<>();

        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {

            String[] d = line.split(",");
            Student s = new Student();

            s.id = Integer.parseInt(d[0]);
            s.name = d[1];
            s.age = Integer.parseInt(d[2]);
            s.marks = Integer.parseInt(d[3]);

            list.add(s);
        }

        list.forEach(System.out::println);
        br.close();
    }
}
