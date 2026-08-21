package com.Serialization.src;

public class Account {
	public Account(int balance,String name, String ifscCode, String location) {
		super();
		this.balance = balance;
		this.name = name;
		this.ifscCode = ifscCode;
		this.location = location;
	}

	private int balance;
	private String name;
	private String ifscCode;
	private String location;
	public int getBalance1() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIfscCode() {
		return ifscCode;
	}
	
	public String getLocation() {
		return location;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}