package com.stream.toList.day2.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class driver {
	public static void main(String[] args) {
		List<String > list = Arrays.asList("CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR : ","CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR  ");
		List<String> list1 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct : "+ list1);
		
	}

}
