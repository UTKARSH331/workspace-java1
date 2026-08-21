package oops3;

public class Premiumaccount extends SavingAccount{
	
	
	int rateOfFreeTransaction = 0;
	public void premiumtransactionrate() {
		System.out.println("premiumtransactionRate " + amount *rateOfFreeTransaction/100 );
		
	}

}
