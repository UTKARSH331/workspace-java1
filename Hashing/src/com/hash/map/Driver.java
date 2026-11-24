package com.hash.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// all hashTable is by default syncronized is here (like  )
		Map <String, Integer>  m1 = new HashMap<String, Integer>();
         m1.put("Apple", 100000);
         m1.put("Samsung", 120000);
         m1.put("Benz", 10000);
         m1.put("Tesla", 10101);
        Map<String , Integer > m1Synscronized = Collections.synchronizedMap(m1);
        m1Synscronized.put("Benz", 1010);
        System.out.println(m1Synscronized);
        m1.get(m1Synscronized);
	}

}
