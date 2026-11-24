package com.utility.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String > cities = new ArrayList<String>();
		cities.add("BLR");
		cities.add("AHM");
		cities.add("DLH");
		cities.add("BHR");
		cities.add("GGN");
		cities.add("HYD");
		Iterator< String > itr = cities.iterator();
		while(itr.hasNext()) {
			String ele = (String) itr.next();
			System.out.println(ele);
			// removing the element at index 3rd // modify the collections
			cities.remove(3);
			System.out.println(cities);
		}

	}

}
