package com.generics.multileveluniversitycourse;

class Course<T extends CourseType> {
    T type;

    Course(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}