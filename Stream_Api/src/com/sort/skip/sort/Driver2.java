package com.sort.skip.sort;

import java.util.Arrays;
import java.util.List;

public class Driver2 {
	
	public static void main(String[] args) {
		List<String > list = Arrays.asList("CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR : ","CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR  ");
		 list.stream().sorted().forEach(e -> System.out.println(e));		
	}

}
