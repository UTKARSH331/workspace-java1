package com.utility.modcount;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				// removing the element
				cities.remove(3);
//here modcount means modification cont bcz when (both side modcount becomes do not equal then  it )

			}
			}
}
