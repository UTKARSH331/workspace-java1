package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverStreamMap4 {
	
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Ahmadabed : ", "Ajmer : ", "Jaipur : ", "jaisalmer : ", "Bhopal : ", " Bihita : ");
		Stream<String > inputStream = cities.stream();
		Stream<String > filterStream = inputStream.filter(city -> city.startsWith("A"));
		Stream<Object> mapString =  filterStream.map(word -> word.toLowerCase());
	//	List<String> output =  mapString.collect(Collectors.toList());
	//	System.out.println(output);
	}

}
