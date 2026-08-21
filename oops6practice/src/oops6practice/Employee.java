package oops6practice;

public class Employee {
	String name;
	Employee (String name){
		this.name = name;
		System.out.println("name " + name);
	}
}

class Manager extends Employee{
	

	Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
