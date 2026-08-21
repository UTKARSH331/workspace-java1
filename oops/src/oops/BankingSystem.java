package oops;

public class BankingSystem {
	
	// shared by all objects in one class 
	private static int nextAccount_Number = 1000;
	private static int totalAccounts = 0;
	// unique for each object 
	private String Account_Holder_name;
	private int balance;
	private int Account_Number;
	
	
	public BankingSystem( String Account_Holder_name, int balance) {
		super();
		if (Account_Holder_name == null || Account_Holder_name.trim().isEmpty()) {
			throw new IllegalArgumentException("account holder doesnot have name ");
		}
		if(balance < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative. ");
		}
		
		this.balance = balance;
		this.Account_Holder_name = Account_Holder_name;
		this.Account_Number = nextAccount_Number++;
		 totalAccounts++;
	}
	public void deposits(int amount) {
		if (amount <= 0) {
			System.out.println("not enough money have to deposits ");
			return;
		}
		
		balance +=  amount;
		System.out.println("sucessfully deposited " + amount );
	}
	public void  withdrawl(int amount) {
		if (balance <= 0 || amount <= 0 || balance < amount) {
			System.out.println("low balance for withdrawl  ");
			return;
		} 
		balance = balance - amount;
		System.out.println("Successfully withdrawl " + amount);	
	}
	public void setHoldername (String Account_Holder_name) {
		if (Account_Holder_name == null ||  Account_Holder_name.trim().isEmpty()) {
			System.out.println("not allowed to change it ");
			return;
		}
		    this.Account_Holder_name  = Account_Holder_name;
	}
	public int Checkbalance() {
		return balance;
	}
	public   int getAccount_Number() {
		return Account_Number;
	}
	public static int gettotalAccounts() {
		return totalAccounts;
	}
	public void accountDetails() {
		System.out.println("----------------------------");
        System.out.println("Account Number : " + Account_Number);
        System.out.println("Account Holder : " + Account_Holder_name);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("Checkbalance() " + Checkbalance());
        System.out.println("getAccount_Number() " + getAccount_Number());
        System.out.println("gettotalAccounts() " + gettotalAccounts());
        System.out.println("----------------------------");
    
	}
	
	

}