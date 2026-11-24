package com.override.thehashCode.with.equals;

import java.util.HashSet;
import java.util.Set;



public class Driver {
	private String name;
	public Driver(String name) {
		this.name = name;
	}
	public int hashCode() {
		return this.name.hashCode();
	}
	public boolean equals(Driver dr) {
		return this.name.equals(dr.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Driver> set = new HashSet<Driver>();
		Driver e1 = new Driver("car");
		Driver e2 = new Driver("car");
		
		set.add(e1);
		set.add(e2);
		System.out.println(e1.hashCode() + "e1.hashCode(): " +  "e2.hashCode(): " + e2.hashCode());
         System.out.println(e1.equals(e2));
	}

}
