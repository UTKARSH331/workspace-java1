package interface4;

import java.io.ObjectStreamClass;

public class Employee1 implements Cloneable {
	String name;
	String location;
	Employee1(String name, String location){
		super();
		this.name = name;
		this.location = location;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Driver1 {
	public static void main(String args[]) throws CloneNotSupportedException{
		Employee1 E1 = new Employee1("Ajay ", "DLH");
		Employee1 E2 = (Employee1)E1.clone();
		System.out.println("E2.location " + E2.location + " " + E2.name);
	}
}
