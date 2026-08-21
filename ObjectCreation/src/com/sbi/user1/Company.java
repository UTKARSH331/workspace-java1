package com.sbi.user1;

class Employee extends Company{
	
	String companyName;
	String employeeName;
	
	
	public Employee(String _companyName,String _employeeName) {
		super(_companyName);
		this.companyName = _companyName;
		this.employeeName = _employeeName;
		
		printThis( employeeName);
	}
	void printThis(String employeeName) {
		System.out.println("Employee Name:"+employeeName);
	}
	
}



public class Company  {

	String companyName;
	
	public Company(String _companyName) {
		super();
		this.companyName =_companyName;
		
		print(companyName);
	}
	
	void print(String companyName) {
		System.out.println("Comapny Name:"+companyName);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("TCS", "Raj");
	}

}
