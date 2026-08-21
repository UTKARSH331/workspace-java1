package com.kodewala.string;

public class StringExp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello" + "World";
		
		String s2 = "kodewala";
		String s3 = "Academy";
		
		String s4 = s2 + s3;
		String s5 = s4.intern(); //it will copy s4 heap and paste in scp as a string s5
		
	System.out.println(s4 == s5);
	}

}
