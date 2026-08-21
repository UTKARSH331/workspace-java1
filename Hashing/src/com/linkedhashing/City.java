package com.linkedhashing;

import java.util.LinkedHashSet;
import java.util.Set;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* linkedHashSdet has a doublyLinkedList */
		Set<String> cities = new LinkedHashSet<String>();
		cities.add("BLR");
		cities.add("CHE");
		cities.add("BHR");
		cities.add("HYD");
		cities.add("DLH");
		cities.add("MBI");
		System.out.println(cities);

	}

}
