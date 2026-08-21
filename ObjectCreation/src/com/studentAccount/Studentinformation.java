package com.studentAccount;

public class Studentinformation {
	
	private String studentName;
	private int rollNo;
	private String marks;
	private String remarks;
	

	{
		System.out.println("IIb");
	}
	static 
	{
		System.out.println("SIB");
	}
	public Studentinformation(String studentName,int rollNo, String marks, String remarks )
	{
		this.studentName = studentName;
		
		this.rollNo = rollNo;
		
		this.marks = marks;
		
		this.remarks = remarks;
		System.out.println("main_method");
		
	}

}
