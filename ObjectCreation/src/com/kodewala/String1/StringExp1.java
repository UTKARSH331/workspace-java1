package com.kodewala.String1;

public class StringExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "swiss";
		char[] inputArr1 = text.toCharArray();
;
		for(int i =0; i<inputArr1.length; i++) {
			char currentChar = inputArr1[i];
			if(text.indexOf(currentChar) != text.lastIndexOf(currentChar)) {
				System.out.println(currentChar);
				break;
			}
			
		}
		System.out.println();
		
	}

}

// final 
