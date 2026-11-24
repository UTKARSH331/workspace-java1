package com.sorted_map;

import java.util.SortedMap;
import java.util.TreeMap;

public class Driver2 {
	    public static void main(String[] args) {
	    	 SortedMap<Integer, String> s1 = new TreeMap<Integer, String>((a,b) -> b-a);
	    	 s1.put( 1211, "Vikash0 ");
	    	 s1.put(1212 , "Vikash1 ");
	    	 s1.put(1122 , "Vikash2 ");
	    	 s1.put(231 , "Vikash3 ");
	    	 s1.put(212 , "Vikash4 ");
	    	 System.out.println(s1);
	    	 System.out.println(s1.firstKey());
	    	 System.out.println(s1.lastKey());
	    	 System.out.println(s1.headMap(212));
	    	 System.out.println(s1.tailMap(1122));
	    	 
			
		}
	     
	}

	

