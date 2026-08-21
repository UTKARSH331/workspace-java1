package oops3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Premiumaccount pmAcc = new Premiumaccount();
		System.out.println("pmAcc.rateOfFreeTransaction() " + pmAcc.rateOfFreeTransaction);
		pmAcc.premiumtransactionrate();
		currentAccount currAcc = new currentAccount();
		currAcc.CurrentAccount();
		SavingAccount savAcc = new SavingAccount();
		System.out.println(savAcc.amount);
		System.out.println(pmAcc.amount);
		System.out.println(currAcc.amount);
		currAcc.CurrentAccount();
		
	}

}
