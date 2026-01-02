import java.util.ArrayList;

// Interface for department-related behavior
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract base class
abstract class Employee {

    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation via getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + calculateSalary());
    }
}
