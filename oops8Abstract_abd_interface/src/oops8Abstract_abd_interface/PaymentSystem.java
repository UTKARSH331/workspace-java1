package oops8Abstract_abd_interface;

public abstract class PaymentSystem {
	public abstract void doTxn();
	public abstract void upiPayment();
	
	public static void main(String args[]) {
		System.out.println();
	}
}

class UpiPayement extends PaymentSystem{
	@Override
	public  void doTxn()
	{
		System.out.println("doTxn() ");
		
	}
	@Override
	public void upiPayment() 
	{
		System.out.println("upiPayment() ");
	}
	
}
