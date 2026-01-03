package com.linkedlist.singlylinkedlist.studentmanagement;

public class StudentList {
    StudentNode head;

    // Add at end
    void addStudent(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Delete by roll number
    void deleteStudent(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Search
    void searchStudent(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println(temp.roll + " " + temp.name + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade
    void updateGrade(int roll, char newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    // Display all
    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}
