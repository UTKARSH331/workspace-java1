package com.counting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String > cities = Arrays.asList("CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR : ","CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR  ");
		long total = cities.stream().collect(Collectors.counting());
		System.out.println("total : " + total);
		Map<Object, List<String>> objects = cities.stream().collect(Collectors.groupingBy(c->c.length()));
		System.out.println("objects : " + objects);
	}

}
