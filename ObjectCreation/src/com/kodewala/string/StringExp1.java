package com.kodewala.string;

public class StringExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "BLR";
		city.concat("BLR");
		city.concat("patna");
		
		String city1 = "Delhi";
		String c1 = city1.concat("Delhi");
		String c2 = city1.concat("kolkata");
		
		//System.out.println("BLR " + city);
		
	//	System.out.println("c1 " + c1 );
		
		// System.out.println("c2 " + c2 );
		
		// System.out.println(city1 == c1);
		System.out.println(city1 == c2);
		// object identity matters 

	}

}
