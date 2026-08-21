package com.sbi.user;

public class SBIUser {
	
	private String name;
	private String userId;
	private String pwd;
	private int balance;
	
	
	SBIUser()
	{
		System.out.println("i  ");
	}
	
	SBIUser( String _name, String _userId, String _pwd, int _balance)
	{
		System.out.println("i am in side sbiuser ");
	    this.name = _name;
		this.userId = _userId;
		this.pwd = _pwd;
		this.balance = _balance;
	}
	

	public static void main(String[] args) 
	{
		System.out.println("main start ");
		//int amount = 200;
		// 
		
		SBIUser s1  = new SBIUser("Abhinav", "Abhi@123", "Abhi@@231", 1010); // abhinav logged-in
		// ashish also logged in 
		SBIUser s2 = new SBIUser("Ashish ", "ashish@231 ", "ashish@221 ", 12223);
		
		System.out.println("main end ");
		
		//type ref name = new Object created for class SBIUser
		
		// TODO Auto-generated method stub
		// it is impossible to create object without constractor in java
      
	}

}
