package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DrivermaptoFlatMap {
public static void main(String[] args) {
	List<List<String>> cities = Arrays.asList(Arrays.asList("Banglore : ", "Bangkok : "), Arrays.asList("Delhi : ", "paris : "), Arrays.asList("patna : ", "punjab : "));
	List<String> output = cities.stream().flatMap(list -> list.stream()).filter(w -> w.startsWith("P")).map(word -> word.toLowerCase()).collect(Collectors.toList());
	System.out.println("doublelist to stream to flatmap to filter to map to collect to collectors   " + output);
}
}
