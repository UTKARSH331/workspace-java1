package com.hashing.product.employee;

import java.util.HashSet;
import java.util.Set;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> employees = new HashSet<Employee>();
		Employee e1 = new Employee("Kodewala");
		employees.add(e1);
		Employee e2 = new Employee("Kodewala");
		employees.add(e2);
		System.out.println("e1 :" + e1.hashCode() );
		System.out.println("e2 :" + e2.hashCode() );
		System.out.println(e1.equals(e2));
		System.out.println(employees);

	}

}
