package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverMap1 {
	
	public static void main(String[] args) {
		List<List<String>> inputFoodName  = Arrays.asList(Arrays.asList("Gauva : "), Arrays.asList("Mango : "), Arrays.asList("Apple : "), Arrays.asList("orange : "));
		List<String > outputFoodName = inputFoodName.stream().flatMap(List -> List.stream()).map(w -> w.toLowerCase()).filter(food -> food.startsWith("o")).collect(Collectors.toList());
		System.out.println(outputFoodName + "output food name ");
	}

}
