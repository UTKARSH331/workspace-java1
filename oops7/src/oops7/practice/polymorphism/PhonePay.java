package oops7.practice.polymorphism;

public class PhonePay extends Payment{
	public void doPayment() {
		System.out.println("doPaymentvia( ) with PhonePay ");
	}
	public void doVerification() {
		System.out.println("verification step at PhonePay ");
	}
	public void doVerification1(String name) {
		System.out.println("verification step at PhonePay with the refrence name  ");
	}

}
