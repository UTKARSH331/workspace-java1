package com.copy.constructor.src;

public class Animal {
	Animal(){
		System.out.println("Animal constructor ");
	}

}

class Dog extends Animal{
	//compiler generated constructor 
	// first it is goes to parents constructor via super called it 
	//so it goes to parents constructor then child / Dog constructor 
	Dog(){
		super();
		System.out.println("dog constructor ");
	}
	
}
class main{
	public static void main(String args[]) {
		Animal A1 = new Dog();
		
	}
}