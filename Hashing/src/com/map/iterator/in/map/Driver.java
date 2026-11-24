package com.map.iterator.in.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Driver {
	private static final String Set = null;

	public static void main (String args[]) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Karnataka", "BLR");
		map.put("Gujarat", "GandhiNagar");
		map.put("Maharastra", "Mumbai");
		map.put("Gujarat", "GN");
		map.put("Punjab", "Chandigarh");
		map.put("Harayana", "Chandigarh");
		System.out.println(map);
		
		java.util.Set <Entry<String, String>> entryset = map.entrySet();
		Iterator<Entry<String, String>> itr = entryset.iterator();
		while(itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("entry.getKey() : " + entry.getKey() + "entry.getValue() : " + entry.getValue());
		}	
	}
}
