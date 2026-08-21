package com.kodewala.string;

public class StringExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "DElhi";
		city.concat("india");
		
		String temp = "banglore";
		String s1 = new String(temp);

		System.out.println(temp == s1);      // false
		System.out.println(temp.equals(s1)); // true // compares names banglore
		
		
	}

}

// read more about VM ARGUMENT ?
