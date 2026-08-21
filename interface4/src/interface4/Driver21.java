package interface4;

class Address {
	String city;
	
	public Address(String city) {
		// TODO Auto-generated constructor stub
		super();
		this.city = city;
	}
	public Address clone() throws CloneNotSupportedException{
		return (Address) super.clone();
	}

	//
}
class Employee implements Cloneable{
	String name;
	Address address;
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class Driver21 {
	public static void main (String args[]) throws CloneNotSupportedException {
		Address address = new Address("Btm layout ");
		Employee e1 = new Employee("Utk", address);
		Employee e2 = (Employee) e1.clone();
		e2.address.city = "Test Stage";
		System.out.println(" orginal Obj : " + e1.name);
		System.out.println("Original Obj:" + e1.address.city);
		System.out.println(" cloned Obj : " + e2.name);
		System.out.println("cloned  Obj:" + e2.address.city);
		
	}

}
