package oops7.practice.polymorphism;

public class ProcessPayment {
	public void  ProcessPayment(Payment p1) {
		p1.doPayment();
		System.out.println("done process in ProcessPayment ");
	   p1.doVerification();
	   p1.doVerification1(null);
	}

}
