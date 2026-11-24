package finance.infosys.bean_creation_mulyiple_types;

public class Employee {
	String firstname;
	String lastname;
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public void display() {
		System.out.println("starting of the employee details");
		System.out.println("firstname : " + firstname);
		System.out.println("lastname : " + lastname);
		System.out.println( " ending of the employee details");
	}

}
