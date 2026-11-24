package finance.infosys.dependency_injection;

public class Employee {
	String firstName;
	String lastName;
	String empCode;
	Address1 address;
	public Employee(String firstName, String lastName, String empCode, Address1 address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empCode = empCode;
		this.address = address;
	}
	
	@Override
	public String toString() {
	    return "Employee [firstName=" + firstName
	            + ", lastName=" + lastName
	            + ", empCode=" + empCode
	            + ", address=" + address.displayAddress1() + "]";
	}
	
	

}
