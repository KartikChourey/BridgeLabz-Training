package com.linkedlist.singlylinkedlist.studentmanagement;

public class StudentMain {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addStudent(1, "Kartik", 20, 'A');
        list.addStudent(2, "Rohit", 21, 'B');
        list.display();
        list.updateGrade(2, 'A');
        list.searchStudent(2);
    }
}
