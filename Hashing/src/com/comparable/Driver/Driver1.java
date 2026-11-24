package com.comparable.Driver;



import java.util.Set;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee>{
	String name;
	int Id;
	public Employee1 (String name, int Id){
		this.name = name;
		this.Id = Id;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.Id, o.Id);
	}
	
}
public class Driver1 {
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
		Set<Employee1 > empset = new TreeSet<Employee1>();
	    empset.add(new Employee1("BHR", 10000));
	    empset.add(new Employee1("CHE", 10010));
	    empset.add(new Employee1("PNBE", 1010));
	    for(Employee1 emp1 : empset) {
	    	System.out.println(emp1.Id  + ": emp1.Id "+ emp1.name + "emp1.name");
	    }
	    

	}

}

