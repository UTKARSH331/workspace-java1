package oops7.practice.polymorphism;

public class Driver10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingSystem Bs1 = new BookingSystem();
		Bs1.doBookTicketVia("Rahul");
		Bs1.doBookTicketVia("Suman", 1001);
		Bs1.doBookTicketVia("Utkarsh", 100, "rajutkarsh231@gmail.com");

	}

}
