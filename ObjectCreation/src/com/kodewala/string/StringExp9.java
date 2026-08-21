package com.kodewala.string;

public class StringExp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("hello ");
		sb.append("world");
		System.out.println(sb);
		// total 4 objects 2 scp and 2 heap if System.out.println(sb);  this is not there then
		// there will be 2 scp and 1 heap bcz StringBuilder.toString () is not there so overall is 3 objects created here 

	}

}
