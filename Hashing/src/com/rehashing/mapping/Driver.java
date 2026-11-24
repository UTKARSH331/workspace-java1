package com.rehashing.mapping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Driver {
	public static <K> void main(String args[]) {
		Set<String > set = new HashSet<String>();
		set.add("Some_Key");// hashmap --> put(key, value)
		Map<String , String> map = new HashMap<String, String>();// capacity 16.
		map.put("Karnataka", "BLR");
		map.put("Gujarat", "GandhiNagar");
		map.put("Maharastra", "Mumbai");
		map.put("Gujarat", "GN");
		map.put("Punjab", "Chandigarh");
		map.put("Harayana", "Chandigarh");
		System.out.println(map);
		System.out.println(set);
		System.out.println("...LinkedHashMap Started....");
		LinkedHashMap< String, String> linkedhashmap = new LinkedHashMap<String, String>();
		linkedhashmap.put("Karnataka", "BLR");
		linkedhashmap.put("Maharastra", "Mumbai");
		linkedhashmap.put("Gujarat", "GN");
		linkedhashmap.put("Gujarat", "GhandhiNagar");
		linkedhashmap.put("Punjab", "Chandigarh");
		linkedhashmap.put("Haryana", "Chandigarh");
		System.out.println(linkedhashmap);
		System.out.println(".....treeMap...started......");
		Map <String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("Karnataka", "BLR");
		treeMap.put("Maharastra", "Mumbai");
		treeMap.put("Gujarat", "GN");
		treeMap.put("Gujarat", "GhandhiNagar");
		treeMap.put("Punjab", "Chandigarh");
		treeMap.put("Haryana", "Chandigarh");
		System.out.println(treeMap);
	}

}
