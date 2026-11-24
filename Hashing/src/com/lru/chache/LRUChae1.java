package com.lru.chache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUChae1<K, V> extends LinkedHashMap<K, V>{
	private int capacity;
	public LRUChae1(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}
	@Override
	protected boolean removeEldestEntry( Map.Entry<K, V> eldest) {
		return size() > capacity;
	}
	
	public static void main(String[] args) {
		LRUChae1<String , Integer> studentName = new LRUChae1<>(3);
		studentName.put("ABhi", 1210);
		studentName.put("UTK", 1110);
		studentName.put("RAHUL", 1101);
		studentName.put("ABHI", 1110);
		studentName.put("UTK1", 1000);
		studentName.put("SHBM", 0001);
		studentName.put("depak", 1008);
		System.out.println(studentName);
	}

}
