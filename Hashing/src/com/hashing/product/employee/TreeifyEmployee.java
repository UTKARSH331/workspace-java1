package com.hashing.product.employee;

import java.util.HashSet;
import java.util.Set;

public class TreeifyEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> employees = new HashSet<Employee>(64);
		Employee e1 = new Employee("kodewala");
		Employee e2 = new Employee("kodewala");
		Employee e3 = new Employee("kodewala");
		Employee e4 = new Employee("kodewala");
		Employee e5 = new Employee("kodewala");
		Employee e6 = new Employee("kodewala");
		Employee e7 = new Employee("kodewala");
		Employee e8 = new Employee("kodewala");
		Employee e9 = new Employee("kodewala");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
	//	employees.add(e2);
		System.out.println(employees);

	}

}
