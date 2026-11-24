package com.map.questions.identityhashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		String k1 = new String("Key");
		String k2 = new String("Key");
		Map<String , Integer> m1 = new HashMap<String, Integer>();
		m1.put(k1, 2);
		m1.put(k2, 3);
		System.out.println(m1);
	}

}
