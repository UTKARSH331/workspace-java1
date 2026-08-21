package com.kodewala.string.extra;

public class Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Banglore";// 1 obj in SCP
		String s2 = "Banglore";// no object created. s2 will refer object (s1)
         
		System.out.println(s1 == s2); // compare the objects address 
	}

}
