package com.partionby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(32,22,10,54,33,12,56,77,12,43,110,001,32);
		Map<Boolean, List<Integer>> output = input.stream().collect(Collectors.partitioningBy(n-> n %2 == 0));
		System.out.println("output : "+output);
	}

}
