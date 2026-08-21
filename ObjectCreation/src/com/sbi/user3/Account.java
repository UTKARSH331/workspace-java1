package com.sbi.user3;

public class Account extends Object{
	
	private String name;
	private int balance;
	
	Account()
	{
		// 1st line of constructor
		this("sanjay", 3000); // calling the super class no args constructor
	}
	
	Account (String _name, int _balance)
	{
		super(); // object class constructor 
		this.name = _name;
		this.balance = _balance;
	}
	
	Account (int _balance, String _name)
	{
		this.name = _name;
		this.balance = _balance;
	}

	

}
