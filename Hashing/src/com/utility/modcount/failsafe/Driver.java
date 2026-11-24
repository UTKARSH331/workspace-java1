package com.utility.modcount.failsafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> cities = new CopyOnWriteArrayList<String>();
		cities.add("AHM");
		cities.add("BLR");
		cities.add("HYD");
		cities.add("GGN");
		cities.add("DL");
		cities.add("CH");
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext()) {
			String ele = (String) itr.next();
			System.out.println(ele);
			if(ele.equalsIgnoreCase("AHM")) {
				System.out.println("Driver main()..... removing");
				cities.remove(3);
			}
		}

	}

}
