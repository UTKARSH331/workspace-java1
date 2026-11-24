package com.parallel.pool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banglore ", "Delhi ", "Ranchi ", "Hyderabad ");
		List<String> l11 = list.stream().filter(w -> w.startsWith("B")).collect(Collectors.toList());
		System.out.println("l11 " + l11);
		
		List<String> l12 = list.parallelStream().filter(n -> n.startsWith("H")).collect(Collectors.toList());
		System.out.println( "l12 " + l12);
	}

}
