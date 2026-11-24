package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverMap5 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Ahmadabed : ", "Ajmer : ", "Jaipur : ", "jaisalmer : ", "Bhopal : ", " Bihita : ");
		List<String> output = cities.stream().filter(city -> city.startsWith("A")).map(w -> w.toLowerCase()).collect(Collectors.toList());
		System.out.println("List to map : " + output);
	}

}
