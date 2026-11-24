package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverListOfIntegers {
	
	public static void main(String[] args) {
		List<Integer> Integer = Arrays.asList(1,5,20,200,130);
		List<Integer> outputInteger = Integer.stream().filter(w-> w > 50).collect(Collectors.toList());
		System.out.println("no greater than 50 : " + outputInteger);
	}

}
