package com.kodewala.string;

public class StringExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String address = "BTM";
		//String City_address = address.concat(" Banglore"); // heap
		//String ip_address = City_address.concat(" 127.00.0.03");
		
		
		String adress = "BTM Banglore"; //scp
		String as = new String (" Banglore"); // heap + scp // first in scp and second in heap
		String adress1 = "BTM" +  as ; // heap
		
		System.out.println(adress1 == adress);// 
		
		//System.out.println(City_address.equals(adress));
		
		//System.out.println(City_address == adress);
		//System.out.println(address);
	//	System.out.println(City_address);
	//	System.out.println(ip_address);
		
		

	}

}
