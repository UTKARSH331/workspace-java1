package oops4;

public class Upcasting_and_Downcasting {
	
	String name = "Shyam ";

}
class  Employee1 extends Upcasting_and_Downcasting{
	String name1 = "ram";
	
}

class Manager1 extends Employee1{
	public static void main(String args[]) {
		Manager E1 = new Manager();
		int a = 10;
		Employee1 E2 = (Employee1) new Manager1();
		
		Manager1 magr = (Manager1 ) new Employee1();
	}
}
