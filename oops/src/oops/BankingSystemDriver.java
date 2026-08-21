package oops;

public class BankingSystemDriver {

	public static void main(String[] args) {
		BankingSystem BS = new BankingSystem(" Aman ", 100);
		BankingSystem BS1 = new BankingSystem("ghfhg ",101);
		BS.deposits(78);
		
		System.out.println("BsDeposit " + BS.Checkbalance() );
		
		BS.withdrawl(76);
		System.out.println("withdrawl " + BS.Checkbalance());
		// System.out.println("getAccount_Number() " + getAccount_Number());
		// gettotalAccounts()
		
		BS1.deposits(75);
        System.out.println("BsDeposit " + BS1.Checkbalance() );
		
		BS1.withdrawl(73);
		System.out.println("withdrawl " + BS1.Checkbalance());
		BS1.accountDetails();

	}

}