package com.copy.constructor.src;

public class Geeks_Constructor_Overloading {
	public Geeks_Constructor_Overloading (String name) {
		System.out.println("it has one parameters " + name );
	}
	public Geeks_Constructor_Overloading(String name, int roll) {
		System.out.println("It has two parameters "+ name + roll);
	}
	public Geeks_Constructor_Overloading(String name, int roll, String name1) {
		System.out.println("it has three parameters "+ name + roll + name1);
	}
	public static void main(String args[]) {
		System.out.println("main method Starts ");
		
		Geeks_Constructor_Overloading  g1 = new Geeks_Constructor_Overloading ("Ram");
		
		Geeks_Constructor_Overloading  g3 = new Geeks_Constructor_Overloading ("Ravan ", 1212, "Lankesh");
		
		Geeks_Constructor_Overloading  g2 = new Geeks_Constructor_Overloading ("Shayam ", 121);
	
		
		System.out.println("main method  ends ");
	}
	

}
