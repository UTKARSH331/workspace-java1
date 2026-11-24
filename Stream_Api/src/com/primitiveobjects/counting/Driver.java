package com.primitiveobjects.counting;

import java.util.Map;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		String input = "Swiss";
		Map<Character, Long> output = input.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(output + "output ");
	}

}
