package com.practice.StringBuilder;

public class PracticeIIB {
     static {
    	 System.out.println("first Static ");
     }
     int i =0;
     {
    	 
    	 System.out.println(i++);
     }
     
     PracticeIIB(){
    	 System.out.println("after IIb it is constructor");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Main Started");
		PracticeIIB p1 = new PracticeIIB();
		System.out.println("Main Ended");
		

	}

}
