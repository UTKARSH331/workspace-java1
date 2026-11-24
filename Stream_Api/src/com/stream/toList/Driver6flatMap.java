package com.stream.toList;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver6flatMap {
	public static void main(String[] args) {
		List<List<String>> cities = Arrays.asList(Arrays.asList("Banglore : ", "Bangkok : "), Arrays.asList("Patna  : ", "Punjab : "),Arrays.asList("Banglore : ", "Paris: "), Arrays.asList("Patna : ", "Bangkok : "));
		List<String > output = cities.stream().flatMap(list -> list.stream()).filter(city -> city.startsWith("B")).map(word -> word.toLowerCase()).collect(Collectors.toList());
		System.out.println(output);
	}

}
