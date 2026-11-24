package finance.infosys.Dependency_di;

public class Employee {
	String firstName;
	String lastName;
	Address1 address;
	public Employee(String firstName, String lastName, Address1 address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String displayEmployee () {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address.displayAddress1() + "]";
	}
	
	

}
