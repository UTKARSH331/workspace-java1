package com.practice.StringBuilder;

public class ProblemCreatedinempouee {
	
	public static int empId;
	public  String Query = "employee needs aprroval for vacation ";
	public String constructorQuery (String empName, int salary, int empId) {
		StringBuilder finalQuery = new StringBuilder(Query);
		
		if(empName != null ) {
			finalQuery.append("i am present "  ).append(empName);
		} else if (salary != 0) {
			finalQuery.append("may salary is " ).append(salary);
		} else {
			finalQuery.append("nothing is here nor empName " ). append("nor empSalary");
		}
		return finalQuery.toString();
	}

	public static void main(String[] args) {
		
		 if (args.length < 2) {
	            System.out.println("Please provide name and salary");
	            return;
	        }
		
		String name = args[0];
		int salary = Integer.parseInt(args[1]);
		// TODO Auto-generated method stub
		ProblemCreatedinempouee Oc = new ProblemCreatedinempouee();
		String query = Oc.constructorQuery(name, salary , empId);
		System.out.println(query);
		
	}

	//com.practice.StringBuilder.ProblemCreatedinempouee

}
