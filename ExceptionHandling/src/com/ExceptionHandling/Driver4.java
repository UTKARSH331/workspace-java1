package com.ExceptionHandling;

public class Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String className = "com.ExceptionHandling";
		
		try {
			Class.forName(className);
			System.out.println("class loaded........");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("you are in the class not found exception..........");
			e.printStackTrace();
		}

	}

}
