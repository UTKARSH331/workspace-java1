package com.imit.forEach;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String > list = Arrays.asList("CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR : ","CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR  ");
		 list.stream().filter(c -> c.startsWith("C")).limit(1).forEach(e -> System.out.println(e));
	
		
	}

}