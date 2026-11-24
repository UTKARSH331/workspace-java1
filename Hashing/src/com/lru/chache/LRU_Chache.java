package com.lru.chache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_Chache<K,V> extends LinkedHashMap<K, V> {
	private int Capacity;
       public LRU_Chache(int Capacity){
    	   super(Capacity, 0.75f, true);
    	   this.Capacity = Capacity;	   
       }
       @Override
       protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    	   return size() > Capacity;
       }
       public static void main(String[] args) {
		LRU_Chache<String, Integer> StudentName = new LRU_Chache<String, Integer>(3);
		StudentName.put("Sohil", 1210);
		StudentName.put("Ram", 1212);
		StudentName.put("Ramu", 1221);
		StudentName.put("Utk", 1211);
		StudentName.put("Govind", 2121);
		StudentName.put("Shayam", 1121);
		System.out.println(StudentName);
	}
}
