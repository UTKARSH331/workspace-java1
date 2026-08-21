package com.hashing.product.employee;

public class Employee {
	public String name;
	public Employee(String name) {
		this.name = name;
	}
	public int hashCode() {
		return this.name.hashCode();
	}
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.name.equals(emp.name);
	}
}


