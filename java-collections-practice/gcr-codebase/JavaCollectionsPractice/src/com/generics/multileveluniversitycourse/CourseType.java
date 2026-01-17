package com.generics.multileveluniversitycourse;

abstract class CourseType {
    abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    public String getEvaluationType() {
        return "Exam Based";
    }
}

class AssignmentCourse extends CourseType {
    public String getEvaluationType() {
        return "Assignment Based";
    }
}

class ResearchCourse extends CourseType {
    public String getEvaluationType() {
        return "Research Based";
    }
}
