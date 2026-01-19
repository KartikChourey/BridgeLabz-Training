package com.collections.map;
import java.util.*;
class Employee {
	 String name, dept;
	 Employee(String n,String d){name=n;dept=d;}
	 
public static void main (String args[]) {
	Map<String,List<Employee>> map = new HashMap<>();
	for(Employee e:List.of(
	 new Employee("Alice","HR"),
	 new Employee("Bob","IT"),
	 new Employee("Carol","HR")))

	 map.computeIfAbsent(e.dept,x->new ArrayList<>()).add(e);

}
	}

	