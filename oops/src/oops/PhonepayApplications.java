package oops;

public class PhonepayApplications {
	private int balance;
	
	public PhonepayApplications(int balance) {
		super();
		this.balance = balance;
	}
	
	public void Deposit(int amount) {
		balance = amount + balance;
	}
	public void Withdrawal(int amount) {
		if (balance >= amount){
			balance = balance - amount;
		}
		
	}
	public int  Checkbalance() {
		return balance;
	}
	
	
	
	

}
