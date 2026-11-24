package com.comparable.Driver;

import java.util.Set;
import java.util.TreeSet;

public class Diver2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String > cities = new TreeSet<String>(); 
		cities.add("BLR");
		cities.add("CHE");
		cities.add("PNBE");
		cities.add("BLR");
		cities.add("BHS");
		cities.add("BGL");
		cities.add("CHE");
		System.out.println("cities : " + cities );
		Set<Employee > empset = new TreeSet<Employee>();
	    empset.add(new Employee("BHR", 10000));
	    empset.add(new Employee("CHE", 10010));
	    empset.add(new Employee("PNBE", 1010));
	    for(Employee emp1 : empset) {
	    	System.out.println(emp1.Id + ": emp1.Id "+ emp1.name + "emp1.name");
	    }

	}

}

