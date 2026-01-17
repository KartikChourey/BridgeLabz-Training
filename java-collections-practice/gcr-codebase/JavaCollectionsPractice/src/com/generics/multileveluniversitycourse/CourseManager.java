package com.generics.multileveluniversitycourse;
import java.util.*;
class CourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getEvaluationType());
        }
    }
}