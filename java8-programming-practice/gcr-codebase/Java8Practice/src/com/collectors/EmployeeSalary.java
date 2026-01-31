package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("A", "IT", 60000),
                new Employee("B", "IT", 80000),
                new Employee("C", "HR", 50000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDepartment,
                                 Collectors.averagingDouble(Employee::getSalary)
                         ));

        System.out.println(avgSalaryByDept);
    }
}
