package com.copy.constructor.src;

public class Student {
	String name;
	int roll_no;
	public Student (String name, int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}
	public Student(Student s) {
		this.name = s.name;
		this.roll_no = s.roll_no;
	}
	void display() {
		System.out.println("name " + name);
		System.out.println("roll_no " + roll_no);
	}
}
class Main{
	public static void main(String args[]) {
		
		Student s1 = new Student("john ", 121);
		Student s2 = new Student(s1);
		System.out.println("original object ");
		s1.display();
		System.out.println("\nCopied Object ");
		s2.display();
	}
	
    
}
