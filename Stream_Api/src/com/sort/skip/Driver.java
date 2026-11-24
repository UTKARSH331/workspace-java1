package com.sort.skip;

import java.util.Arrays;
import java.util.List;

public class Driver {
	


	public static void main(String[] args) {
		List<String > list = Arrays.asList("CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR : ","CHE : ", "DL : ", "AHM : ", "HYD : ", "BLR  ");
		 list.stream().skip(2).forEach(e -> System.out.println(e));
	
		
	}

}


