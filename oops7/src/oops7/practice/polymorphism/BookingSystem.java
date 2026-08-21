package oops7.practice.polymorphism;

public class BookingSystem {
	//String name;
	//String email;
	//double phoneNumber;
	public void doBookTicketVia(String name, double phoneNumber) {
		System.out.println("doBookTicketVia(String name, String email, double phoneNumber)  " + name + phoneNumber);
	}
	public void doBookTicketVia(String name ) {
		System.out.println("doBookTicketVia(String name)  " + name );
	}
	public void doBookTicketVia(String name, double phoneNumber, String email) {
		System.out.println("doBookTicketVia(String name, String email, double phoneNumber)  " + name + phoneNumber + email);
	}

}
