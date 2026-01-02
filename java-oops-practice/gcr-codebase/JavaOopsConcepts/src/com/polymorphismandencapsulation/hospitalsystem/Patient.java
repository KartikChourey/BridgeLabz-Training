package com.polymorphismandencapsulation.hospitalsystem; 

// Medical record interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract patient
abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("Patient: " + name);
    }
}