package com.kodewala.string;

public class Strinhlearnings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// it store in String control pool
		// using literals
		//one of the way to create string oblects
		// it is a case sensitives (banglore ) and (Banglore ) id different 
		//java checks if any objects with content ("Banglore") exists 
		// in string  Constant Pool (SCP), if exists then no object created and
		//  it start refreeing the existing object, if not then it create new
		// content "banglore"
		
		String city = "Banglore"; // object of string inside SCP
		String country = "India";
		String c = "banglore";
		String animal = "cat";
		String animal2 = "cow";
		
        System.out.println(city == c); // false
        System.out.println(" animal " + animal + " animal2 " + animal2);
	}

}

// immutable -> once Strong object 