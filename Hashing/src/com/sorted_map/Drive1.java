package com.sorted_map;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Drive1 {
    public static void main(String[] args) {
    	 SortedMap<String, Integer> s1 = new TreeMap<String, Integer>();
    	 s1.put("Vikash0 " , 1212);
    	 s1.put("Vikash1 " , 1211);
    	 s1.put("Vikash2 " , 1221);
    	 s1.put("Vikash3 " , 1211);
    	 s1.put("Vikash4 " , 1121);
    	 System.out.println(s1);
    	 System.out.println(s1.firstKey());
    	 System.out.println(s1.lastKey());
    	 System.out.println(s1.headMap("Vikash3"));
    	 System.out.println(s1.tailMap("Vikash2"));
    	 
		
	}
     
}
