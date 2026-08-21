package com.kodewala.String1;

public class StringExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Kodewala";
		s1.concat("Academy");
		System.out.println(s1);
	
		 s1 = s1.concat("Academy");
		System.out.println(s1);
		
		 String s23 = s1.concat("Academy");
			System.out.println(s23);
		
		StringBuilder s12 = new StringBuilder("Banglore");
		s12.append("india");
		System.out.println(s12);
		s12.append("56465");
		System.out.println(s12);
		

	}

}
// String 
// StringBuilder ->fast and not thread safe
//StrngBuffer -> slow and thread safe 

