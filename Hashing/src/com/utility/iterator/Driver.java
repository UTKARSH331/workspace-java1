package com.utility.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {
public static void main(String[] args) {
	List <String> ele = new ArrayList<String>();
	ele.add("1");
	ele.add("2");
	ele.add("3");
	ele.add("4");
	ele.add("5");
	ele.add("6");
	ele.add("7");
	ele.add("8");
	System.out.println(ele);
	
	Iterator<String> itr = ele.iterator();
	while(itr.hasNext()) {
		String element = itr.next();
		System.out.println(element  + " :  itr call");
	}
}
}
