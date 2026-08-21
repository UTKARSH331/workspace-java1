package com.copy.constructor.src;

public class Student2 {
	String name;
	int roll;
	
	Student2(){
		this(121, "rahul");//user defiened- no arguments constructor 
		System.out.println("user defiened- no arguments constructor  " );
	}
	Student2(int roll, String name){
		this.roll = roll ;
		this.name = name ;
		System.out.println("constructor parameterized constructor " + roll + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1= new Student2(122 , "Shayam");
		s1 = new Student2();
		

	}

}
