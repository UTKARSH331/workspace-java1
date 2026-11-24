package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Banglore : ",  "Delhi : ", " karnataka  : " , " Mumbai : ", " patana : " , "  jaipur : ");
		Stream<String > inputStream = cities.stream();
		Stream<String> filteredStream = inputStream.filter(city -> city.startsWith("B"));
		List<String> collect = filteredStream.collect(Collectors.toList());
		System.out.println(collect);
	}

}
