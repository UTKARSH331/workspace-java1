package com.arrayslist.day2;

import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) {
		CityNames C11 = new CityNames();
		ArrayList<String> city = C11.c1();
		for(String i : city) {
			if(i.startsWith("D")) {
				System.out.println(i);
				
			}
		}
		

	}

}
