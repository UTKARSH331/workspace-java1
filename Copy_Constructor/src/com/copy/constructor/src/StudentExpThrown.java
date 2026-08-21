package com.copy.constructor.src;

public class StudentExpThrown {
	
	StudentExpThrown(int age){
		if(age < 0) {
			throw new IllegalArgumentException("Age can not be negative ");
		}
		System.out.println("Student closed ");
	}

}
 class  Driver{
	 public static void main (String args[]) {
		 StudentExpThrown S1 = new StudentExpThrown(-5);
		 //System.out.println("s1 student ages " );
	 }
	
}
