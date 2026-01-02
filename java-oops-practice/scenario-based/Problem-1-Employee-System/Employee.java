import java.util.*;

// Interface for department related work
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract parent class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation using getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    protected double getBaseSalary() {
        return baseSalary;
    }

    // Abstract behavior
    public abstract double calculateSalary();

    // Common concrete method
    public void displayDetails() {
        System.out.println("ID : " + employeeId);
        System.out.println("Name : " + name);
        System.out.println("Final Salary : ₹" + calculateSalary());
    }
}
