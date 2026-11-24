package com.immutablemap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Driver {
	
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Ram", 100);
		map1.put("Shayam", 101);
		map1.put("Rohit", 55);
		System.out.println(map1);
		Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
		//map2.put("RRR", 100);
		System.out.println("Map<String, Integer> map2 = Collections.unmodifiableMap(map1); :....." + map2);
		map1.put("XXX", null);
		System.out.println(" map1.put(\"XXX\", null) ..." + map1);
		  Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89); // limitation of upto 10 (k,v ) pairs 
		
		   System.out.println(map3);
		  Map<String, Integer> map12 = Map.ofEntries(Map.entry("HHH", 121), Map.entry("AAA", 1211));
		  System.out.println(" Map.ofEntries :..." + map12);
	}

}
