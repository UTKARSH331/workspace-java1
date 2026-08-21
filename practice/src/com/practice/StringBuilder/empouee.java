package com.practice.StringBuilder;

public class empouee {
	
	public static String Query = "employee needs aprroval for vacation ";
	public String constructorQuery (String empName, int salary) {
		StringBuilder finalQuery = new StringBuilder();
		
		if(empName != null ) {
			finalQuery.append("i am present "  ).append(empName);
		} else if (salary != 0) {
			finalQuery.append("may salary is " ).append(salary);
		} else {
			finalQuery.append("nothing is here nor empName " ). append("nor empSalary");
		}
		return finalQuery.toString();
	}

}
