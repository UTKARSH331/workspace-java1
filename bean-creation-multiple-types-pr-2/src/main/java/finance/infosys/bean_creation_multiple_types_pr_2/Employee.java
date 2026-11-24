package finance.infosys.bean_creation_multiple_types_pr_2;

public class Employee {
	String firstname;
	String lastname;
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public void display() {
		System.out.println("starting of employee....");
		
		System.out.println("firstname....: " + firstname);
		
		System.out.println("lastname....: " + lastname);
		
		System.out.println("ending of employee....");
	}

}
