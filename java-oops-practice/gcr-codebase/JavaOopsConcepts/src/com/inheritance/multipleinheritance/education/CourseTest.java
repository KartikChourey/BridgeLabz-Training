package com.inheritance.multipleinheritance.education;

public class CourseTest {

    public static void main(String[] args) {

        PaidOnlineCourse c1 =
                new PaidOnlineCourse("Java DSA", 120, "YouTube", true, 4999, 30);

        c1.showDetails();
    }
}