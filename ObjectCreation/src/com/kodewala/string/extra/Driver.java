package com.kodewala.string.extra;

public class Driver {
	
	public static void main(String args[]) 
	{
		Driver d = new Driver();
		d.m1();
		System.out.println("Driver_main ");
	}
	
	public void m1() 
	{
		m2();
		System.out.println("Driver.m1()");
	}
	public void m2() 
	{
		m3();
		System.out.println("Driver.m2()");
	}
	public void m3() 
	{
		m4();
		System.out.println("Driver.m3()");
	}
	public void m4() 
	{
		m5();
		System.out.println("Driver.m4()");
	}
	public void m5() 
	{
	
		System.out.println("Driver.m5()");
	}

}
