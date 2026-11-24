package com.map.iterator.in.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Driver3 {
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
		
	     java.util.Set<Entry<String, String>> entrySet = map.entrySet();
	     Iterator<Entry<String, String>> e1 = entrySet.iterator();
	    while(e1.hasNext()) {
	    	Entry <String, String> e11 = e1.next();
	    	System.out.println("get.key : " + e11.getKey()  + e11.getValue() + "get.key : " );
	    }
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}
}

