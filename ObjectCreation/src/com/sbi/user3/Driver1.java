package com.sbi.user3;

class PaymentSystems extends Object
{
	public PaymentSystems(String status) 
	{
		super();
	}
}

class Payment extends PaymentSystems
{
	public Payment() 
	{
	     super("active ");	
	}
}

class Upipayment extends Payment
{
	public Upipayment() 
	{
		
		super(); // no args 
		
	}
	
}

public class Driver1 {

	public static void main(String[] args) 
	{
		
		Upipayment p1 = new Upipayment();
		// TODO Auto-generated method stub

	}
}
