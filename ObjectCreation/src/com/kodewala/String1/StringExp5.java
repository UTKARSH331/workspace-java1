package com.kodewala.String1;

public class StringExp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Kodwala Academy";
		char ssb[] = s1.toCharArray();
		for(char i = 0; i<ssb.length; i++) {
			System.out.println(ssb[i] + " ");
		}
		System.out.println(s1.contains("Kod"));
		System.out.println(s1.startsWith("K"));
		System.out.println(s1.endsWith("y"));

	}

}
