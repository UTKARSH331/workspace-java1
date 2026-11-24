package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverUseFlatMapToConvertIntoSinglList {
	public static void main(String[] args) {
		List<List<String>> inputString= Arrays.asList(Arrays.asList("Suman : "), Arrays.asList("Suraj : "), Arrays.asList("Ujjawal : "));
		List<String> outputString = inputString.stream().flatMap(w -> w.stream()).filter(w -> w.startsWith("S")).map(w -> w.toLowerCase()).collect(Collectors.toList());
		System.out.println("outputString  names : " + outputString );
	}

}
