package com.find.first;

public class DriverP2 {
	public static void main(String[] args) {
		String input = "Swiss";
		Character output = input.chars().mapToObj(c -> (char)c).filter(c-> input.indexOf(c) == input.lastIndexOf(c)).findFirst().get();
		System.out.println(output);
	}

}
