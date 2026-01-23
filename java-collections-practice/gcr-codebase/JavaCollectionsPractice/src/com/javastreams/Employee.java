package com.javastreams;
import java.util.*;
import java.io.Serializable;

//Employee class implementing Serializable for object storage
public class Employee implements Serializable {

 int id;
 String name;
 String department;
 double salary;

 // Constructor to initialize employee object
 Employee(int id, String name, String department, double salary) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }
}



class EmployeeStore {

    public static void main(String[] args) {

        // Creating employee list
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Aman", "IT", 50000));
        employees.add(new Employee(2, "Riya", "HR", 45000));

        try {
            // Writing employee list to file
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"));
            oos.writeObject(employees);
            oos.close();

            // Reading employee list from file
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"));
            ArrayList<Employee> listFromFile = (ArrayList<Employee>) ois.readObject();

            // Displaying employee details
            for (Employee e : listFromFile) {
                System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
            }

            ois.close();

        } catch (Exception e) {
            System.out.println("Serialization or deserialization error.");
        }
    }
}
