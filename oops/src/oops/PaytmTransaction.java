package oops;

public class PaytmTransaction {
	
	private int balance;
	//private String name;
	
	public PaytmTransaction(int balance) {
		this.balance = balance;
		
	}
	public void Deposit(int amount) {
		if(balance > 0 && amount >= 0) {
			balance = amount + balance;
		}
	}
	public void withdrawl(int amount) {
		if(balance >= amount ) {
			balance = balance - amount;
		} else {
			System.out.println("in suffiencent balance ");
		}
	}
	public int checkBalance() {
		return balance;
	}

}
