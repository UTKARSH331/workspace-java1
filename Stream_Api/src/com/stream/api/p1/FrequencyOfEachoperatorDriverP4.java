package com.stream.api.p1;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachoperatorDriverP4 {
	public static void main(String[] args) {
		String country = "India";
		Map<Object, Long> freq = country.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		System.out.println(freq);
	}

}
