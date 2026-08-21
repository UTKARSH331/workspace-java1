
public class GraminBank implements BankingSystem {
	@Override
	public void payment() {
		System.out.println("Payment method in GraminBank ");	
	}
	@Override
	public void transaction() {
		System.out.println("tarnsaction in GraminBank ");	
	}
	@Override
	public void cashWithdrawl() {
		System.out.println("cashwithdrawl in GraminBank ");
	}
	@Override
	public  void passBook() {
		System.out.println("passbook for Gramin Bank User ");
	}

}
