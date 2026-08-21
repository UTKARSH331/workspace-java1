package oops;

public class PaytmDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int balance = Integer.parseInt(args[0]);
		int balance = Integer.parseInt(args[0]);
		int depositAmount = Integer.parseInt(args[1]);
		int WithdrawalAmount = Integer.parseInt(args[2]);
		
		PaytmTransaction pytmacc = new PaytmTransaction(balance);
		pytmacc.Deposit(depositAmount);
		System.out.println("pytmaccDeposit(78) "  + "pytmacc.checkBalance()" + pytmacc.checkBalance());
		pytmacc.withdrawl(WithdrawalAmount);
		
		System.out.println("pytmacc.checkBalance() " + pytmacc.checkBalance());
		

	}

}
