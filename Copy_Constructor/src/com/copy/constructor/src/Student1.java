package com.copy.constructor.src;

public class Student1 {
	private Student1 (String name) {
		System.out.println("Student1 " + name);
	}
	 private Student1(String name, String name1, int roll) {
		System.out.println("Student1 have 3 parameters " + name + name1 + roll);
	}
	 private  Student1(String name, int roll) {
		System.out.println("Student1 have 2 parameters " + name + roll);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1("Ram");
		Student1 s3 = new Student1("ravan " + 121);
		Student1 s2 = new Student1("Ram, " + "Ravan " + 121);
	}

}
