package com.linkedlist.singlylinkedlist.studentmanagement;

public class StudentNode {
    int roll;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}