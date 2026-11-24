package com.string;

public class Driver {
	public static void main(String[] args) {
		String name = "Utkarsh Raj";
		String Sub = "Math";
		int Roll = 62;
		StringBuilder query = new StringBuilder("SELECT * FROM USER WHERE  1 = 1");
		if(name != null) {
			query.append(" AND NAME = ").append(name).append("");
		}
		if(Roll != 0) {
			query.append(" AND ROLL = ").append(Roll).append("");
			
		}
		if(Sub != null) {
			query.append(" Sub = ").append(Sub).append("");
		}
		System.out.println(query);
	}

}
