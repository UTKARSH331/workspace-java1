package oops7.practice.polymorphism;

public class Payment {
	public void doPayment() {
		System.out.println("doPaymentvia( ) ");
	}
	public void doVerification() {
		System.out.println("verification step at PhonePay via Payment");
	}
	public void doVerification1(String name) {
		System.out.println("doVerification1 step at PhonePay with the refrence name  ");
	}
}
