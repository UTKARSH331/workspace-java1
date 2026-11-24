package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverMap2 {
	
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Banglore : ",  "Delhi : ", " karnataka  : " , " Mumbai : ", " patana : " , "  jaipur : ");
		List<String > output = cities.stream().filter(city -> city.startsWith("B")).map(word -> word.toLowerCase()).collect(Collectors.toList());
		System.out.println(output);
	}


}
