package com.generic;

public class Driver9 {

	    public static void main(String[] args) {
	        Box2<Fish> b1 = new Box2<>();
	    }
}

	class Box2<T extends Animal & Swimmable> {
	    T value;
	}

	class Animal {
	    void display() {
	        System.out.println("Displaying Animal");
	    }
	}

	interface Swimmable {
	    void swim();
	}

	class Dog extends Animal {

	}

	class Fish extends Animal implements Swimmable {
	    @Override
	    public void swim() {
	        System.out.println("Fish is swimming");
	    }
	}
	

