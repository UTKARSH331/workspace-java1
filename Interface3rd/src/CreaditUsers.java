
public class CreaditUsers implements Ipayment {

	@Override
	public void accountHolderName() {
		// TODO Auto-generated method stub
		System.out.println("user have to give accountHolderName()  for CreaditUsers");
		
	}

	@Override
	public void accountPaymentMethod() {
		// TODO Auto-generated method stub
		System.out.println("accountPaymentMethod() from CreaditUsers ");
	}
	public static int claculateConvFees(int amount, int txnPercentage, String type) {
		//connectToDb();
		int txnFee = amount * txnPercentage / 100;
		return txnFee;
	}
	

}
