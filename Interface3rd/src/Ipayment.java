
public interface Ipayment {
	
public void accountHolderName();
public void accountPaymentMethod();

public default void checkBalance() {
	connectToDb();
	System.out.println("checkBalance of Ipayment");
}

private static void connectToDb() {
	System.out.println("Ipayment method ");
}


public static int claculateConvFees(int amount, int txnPercentage, String type) {
	connectToDb();
	int txnFee = amount * txnPercentage / 100;
	return txnFee;
}
public static int calculateTxnFees(int amount, int txnPercentage) {
	
	connectToDb();
	printNumber();
	int txnFee = amount * txnPercentage / 100;
	return txnFee;
}
private static void printNumber() {
	System.out.println("printNumber in Ipayment ");
	
}

}
