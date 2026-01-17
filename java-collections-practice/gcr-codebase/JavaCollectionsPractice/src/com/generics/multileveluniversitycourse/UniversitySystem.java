package com.generics.multileveluniversitycourse;
import java.util.*;
public class UniversitySystem {
    public static void main(String[] args) {

        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse());
        courses.add(new ResearchCourse());

        CourseManager.displayCourses(courses);
    }
}