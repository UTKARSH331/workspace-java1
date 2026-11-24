package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverMap {

	public static void main(String[] args) {
		List<List<String>> employeeNames = Arrays.asList(Arrays.asList("Suman : "), Arrays.asList("Utkarsh"), Arrays.asList("Sudhir"), Arrays.asList("Rizwan"));
		List<String> output = employeeNames.stream().flatMap(List -> List.stream()).filter(w -> w.startsWith("U")).map(name -> name.toLowerCase()).collect(Collectors.toList());
		System.out.println("doublelist to stream to flatmap to filter to map to collect to collectors  : " + output);
	}
	
}
