package finance.infosys.Dependency_di_setters;

//import finance.infosys.Dependency_di.Address1;

public class Employee {
	String firstName;
	String lastName;
	Address1 address1;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		//this.address = address;
	}
	
	public void getDisplayAddress(Address1 address1) {
		this.address1 = address1;
	}
	
	public String displayEmployee () {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address " + address1.displayAddress1() + "]";
	}
	
	

}
