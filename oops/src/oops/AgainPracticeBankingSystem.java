package oops;

public class AgainPracticeBankingSystem {
	//static belongs to class one to all objects 
	private static int accountNo = 1000;
	private static int totalCountOfUsers = 0;
	
	// instance belong to object each have its own
	private int balance;
	private String accountHolderName;
	public AgainPracticeBankingSystem(int balance, String accountHolderName) {
		super();
		if(balance <0 ) {
			throw new IllegalArgumentException("balance is Not suffiencient ");
		}
		if(accountHolderName == null && accountHolderName.trim().isEmpty()) {
			throw new IllegalArgumentException("accountHolderName do not have ");
		}
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.accountNo = accountNo+ 1;
		totalCountOfUsers++;
	}
	public int balance() {
		return balance;
	}
	public int deposits(int amount) {
		balance = balance + amount;
		System.out.println("Successfully deposits "  + amount);
		System.out.println(" current balance after deposits "  + balance  );
		return balance;
		
	}
	public void withdraws(int amount) {
		if(balance < 0 && balance < amount) {
			System.out.println("do not have balance ");
			return ;
		} 
		balance = balance - amount;
		System.out.println("successfully withdraws " + amount);
		System.out.println("current balance after  withdraws " + balance );
	}
	public int chechBalance() {
		return balance;
	}
	public int accountNo() {
		return accountNo;
	}
	public int gettotalCountOfUsers() {
		return totalCountOfUsers;
	}
	public String getaccountHolderName() {
		return accountHolderName;
	}
	public void accountDetails() {
		System.out.println("start of the main ");
		System.out.println(" current balance after all procedure  " + chechBalance());
		System.out.println("accountNo()  " + accountNo() );
		
		System.out.println("gettotalCountOfUsers()  " + gettotalCountOfUsers() );
		System.out.println("getaccountHolderName() " + getaccountHolderName());
		System.out.println("the end");
	}

}
