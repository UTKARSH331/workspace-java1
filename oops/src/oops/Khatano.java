package oops;

public class Khatano {
	private int balance;
	public int getbalance()
	{
	     return balance;
	}
	public void setbalance(int balance) {
		if(balance > 0) {
			this.balance = balance;
			
		} else {
			balance = 0;
		}
	}

}
