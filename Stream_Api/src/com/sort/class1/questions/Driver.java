package com.sort.class1.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		
		 List<Double > duplicatesString = Arrays.asList( 50000.00, 55000.00, 60000.00, 65000.00, 70000.00,
		            75000.00, 80000.00, 85000.00, 90000.00, 95000.00, 55000.00);
		 Set<Double> set1 = new HashSet<Double>();
	List<Double> s1 = duplicatesString.stream().filter(n ->!set1.add(n)).collect(Collectors.toList());
		 System.out.println(s1);
		 
	}

}
