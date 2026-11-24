package com.stream.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	String name;
	Integer salary;
	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {


		List<Employee> empInput = Arrays.asList(
				new Employee("Utkarsh ", 10001),
				new Employee("Suman ", 101001),
				new Employee("Suraj ", 100011),
				new Employee("Suman1", 100011)
				);
		
		List<String > empNames = empInput.stream().filter(w -> w.salary>100000).map(N->N.name).collect(Collectors.toList());
		System.out.println(empNames);
	}
	
	
}
