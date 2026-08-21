package com.arrayslist.day2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList_Examples city= new ArrayList_Examples();
		// TODO Auto-generated method stub
     ArrayList<String> c1 =   ((ArrayList_Examples) city).citiesName();
     for (int index = 0; index <c1.size(); index++) {
    	 String name = c1.get(index);
    	 if(name.startsWith("M")) {
    		 System.out.println(name);
    	 }
     }

	}

}
