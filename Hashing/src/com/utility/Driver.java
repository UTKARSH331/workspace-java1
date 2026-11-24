package com.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main (String args[]) {
		List<String > cities = new ArrayList<String>();
		cities.add("BLR");
		cities.add("AHM");
		cities.add("DLH");
		cities.add("BHR");
		cities.add("GGN");
		cities.add("HYD");
		System.out.println(cities);
		Collections.sort(cities);
		System.out.println(" collections sort "+cities);
		
		List<String> unlist = Collections.unmodifiableList(cities);
		System.out.println(unlist);
		//unlist.add("AAA"); // not added bcz of Collections.unmodifiableList(cities); it does not changes 
		Collections.reverse(cities);
		System.out.println("reverse collections "+ cities);
		
		List<String > synclist = Collections.synchronizedList(cities);
		System.out.println(synclist);
		
	}

}
