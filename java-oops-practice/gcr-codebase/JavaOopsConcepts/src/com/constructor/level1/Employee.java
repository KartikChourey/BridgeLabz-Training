package com.constructor.level1;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // salary should be updated using method
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println(employeeID + " - " + department);
    }
}
