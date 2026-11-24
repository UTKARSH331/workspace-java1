package com.hahsing.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver1 {

	public static void main(String[] args) {
		List<String > prd = new ArrayList<String>();
		prd.add("Apple");
		prd.add("orange");
		prd.add("banana");
		prd.add("car");
		prd.add("realme");
		prd.add("oppo");
		Collections.sort(prd );
		List<String> unlist = Collections.unmodifiableList(prd);
		System.out.println(unlist + "unlist");
		System.out.println("System.out.println(unlist + \"unlist\"); " + prd);
		List<String> prdSync = Collections.synchronizedList(prd);
		System.out.println("List<String> prdSync List<String> prdSync  + " + prdSync);
		System.out.println("prd after syncronization " + prd);
		Collections.reverse(prd);
		
		System.out.println("after reverse(prd ) : " + prd );
		prd.get();

	}

}
