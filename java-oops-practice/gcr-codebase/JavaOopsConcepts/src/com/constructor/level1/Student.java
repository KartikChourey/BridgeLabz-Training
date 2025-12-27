package com.constructor.level1;

public class Student {
    public int rollNumber;       // accessible everywhere
    protected String name;       // accessible in subclass
    private double cgpa;         // hidden data

    // public method to update CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // public method to read CGPA
    public double getCGPA() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {
    void showStudent() {
        // can access rollNumber and name
        System.out.println(rollNumber + " - " + name);
    }
}
