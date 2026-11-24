package com.sorted.salary;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

class Employee{
	Integer Salary;
	String name;
	public Employee(String name, Integer Salary) {
		this.name = name;
		this.Salary = Salary;	
	}
	@Override
	public String toString() {
	    return name + " : " + Salary;
	}
}

public class Driver {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Rahul", 50000),
			    new Employee("Amit", 75000),
			    new Employee("Priya", 60000),
			    new Employee("Neha", 90000),
			    new Employee("Rohit", 45000)
			);
		
	Employee output =employees.stream().sorted((a,b) -> Integer.compare(b.Salary, a.Salary)).skip(1).findFirst().get();
	System.out.println(output);
	
	}
}
