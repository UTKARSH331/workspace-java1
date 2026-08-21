
public class Upi implements Ipayment {
//	public void accountHolderName

	@Override
	public void accountHolderName() {
		System.out.println("account name from Upi users ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accountPaymentMethod() {
		// TODO Auto-generated method stub
		System.out.println("Account name from Upi users in accountPaymentMethod()");
	}
	public void checkBalance() {
		
		System.out.println("check balance from upi users");
	}
	
	public static int calculateTxnFees(int amount, int txnPercentage) {
		
		//connectToDb();
		System.out.println("Check Balance from Upi users ");
		int txnFee = amount * txnPercentage / 100;
		return txnFee;
	}
}
