package com.constructor.level1;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute"; // common for all

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void showCourse() {
        System.out.println(courseName + " - " + duration + " weeks - ₹" + fee);
    }

    // update institute name for all courses
    static void changeInstitute(String name) {
        instituteName = name;
    }
}
