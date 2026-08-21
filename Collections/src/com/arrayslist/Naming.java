package com.arrayslist;

import java.util.ArrayList;

public class Naming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Sandeep");
		employeeNames.add("Utkarsh");
		employeeNames.add("Ujjawal");
	//	employeeNames.add(null);
		employeeNames.add("Ritik");
		employeeNames.add("Abhishek");
		System.out.println(employeeNames);
		System.out.println("Start.........");
		for(int index = 0; index <employeeNames.size(); index++) {
			String name = employeeNames.get(index);
			if(name.startsWith("U")) {
				System.out.println(name);
			}
			//System.out.println("ends1......");
		}
		System.out.println("end.........");
		for(int i = 0; i<employeeNames.size(); i++) {
			String n1 = employeeNames.get(i);
			if(n1.startsWith("S")) {
				System.out.println(n1);
			}
		}
		System.out.println("end index i and start another");
		for(int i = 0; i<employeeNames.size();i++) {
			String n2 = employeeNames.get(i);
			if(n2.startsWith("R")) {
				System.out.println(n2);
			}
		}
		System.out.println("R naming ends here ");
	}
	

}
