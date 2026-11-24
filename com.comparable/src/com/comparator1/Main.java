package com.comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1 > l1 = new ArrayList<Employee1>();
		l1.add(new Employee1(103, "Rahul", 25, 7001100, "IT"));
		l1.add(new Employee1(104, "Utk", 25, 7002100, "IIT"));
		l1.add(new Employee1(103, "Utk1", 25, 700001, "GIT"));
		l1.add(new Employee1(103, "Donni", 25, 700010, "IIIT"));
		l1.add(new Employee1(103, "Rahul", 25, 7000021, "ITI"));
		Collections.sort(l1, new EmployeeAgeComparator());
		   System.out.println("Sorted by Age:.......");

	        for (Employee1 e : l1) {
	            System.out.println(e);
	        }
	        Collections.sort(l1, new EmployeeDepartmentComparator());
	        System.out.println("sorted by department.......");
	        for(Employee1 e : l1) {
	        	System.out.println(e);
	        }
		    Collections.sort(l1, new EmployeeIdComparator());
             System.out.println("sorted by Id :...........");
             for(Employee1 e : l1) {
            	 System.out.println(e);
             }
             Collections.sort(l1, new  EmployeeNameComparator());
             System.out.println("sorted by Name : ..........");
             for(Employee1 e : l1) {
            	 System.out.println(e);
             }
             Collections.sort(l1, new EmployeesalaryComparator());
             System.out.println("Sorted by salary : ........");
             for(Employee1 e : l1) {
            	 System.out.println(e);
             }
	}

}
