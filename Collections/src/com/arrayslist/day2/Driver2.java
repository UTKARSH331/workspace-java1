package com.arrayslist.day2;

import java.util.ArrayList;

public class Driver2 {

	public static void main(String[] ar) {
		CityNames c1 = new CityNames();
		ArrayList<String> c22 = c1.c1();
		for(String i :c22) {
			if(i.startsWith("B")) {
				System.out.println(i);
			}			
		}
	}
}
