import java.util.*;

// Driver class
public class EmployeeManagementSystem {

    // Helper method
    static void processEmployees(List<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println("--------------------");
            emp.displayDetails(); // Polymorphism
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Rohit", 50000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Aman", 80, 300);

        list.add(e1);
        list.add(e2);

        processEmployees(list);
    }
}