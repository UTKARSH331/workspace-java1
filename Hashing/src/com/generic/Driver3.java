package com.generic;

public class Driver3 {

	public static void main(String[] args) {
		// typer inference 
		getRoll(11, 12);
		
	
	}
	public static <T> T getName(T x){
		return x;
	}
	public static <T, U> void getRoll(T x, U y){
		System.out.println(" x : " + x + " y : " +  y) ;
	}
	
}
