package oops7.practice.polymorphism;

public class Paymentcw {
	public void Payusing(double cardNumber) {
		System.out.println("Payusing cardNumber() ");
	}
	public void Payusing(String upiId, double amount) {
		System.out.println("Payusing upiId ");
	}
	public void Payusing(String walletId, int otp, double amount) {
		System.out.println("Payusing a wallet ");
	}

}
 class Driver{
	 public static void main(String args[]) {
		 Paymentcw p1 = new Paymentcw();
		 p1.Payusing(1238345);
		 p1.Payusing("suman ", 1000);
		 p1.Payusing("Shubham ", 1010, 2000);
		 
		 //System.out.println();
	 }
 }
