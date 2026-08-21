package oops;

public class Driver3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PhonepayApplications phpne = new PhonepayApplications(4554);
		
		phpne.Deposit(1000);
		System.out.println(phpne.Checkbalance());
		phpne.Withdrawal(232);
		System.out.println( "Checkbalance " + phpne.Checkbalance());
			
		
		

	}

}
