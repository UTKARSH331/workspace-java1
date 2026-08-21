package oops7.practice.polymorphism;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessPayment process1 = new ProcessPayment();
		Payment p2 = new  PhonePay();
		process1.ProcessPayment(new PhonePay());
		process1.ProcessPayment(new PhonePay());
	//	System.out.println("p2.doVerification() " + p2.doVerification());
		p2.doVerification();

	}

}
