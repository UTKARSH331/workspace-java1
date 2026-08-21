package oops;

public class AgainPracticeBankingSystemDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgainPracticeBankingSystem  A1 = new AgainPracticeBankingSystem(122, "Suman");
		A1.deposits(50);
		A1.withdraws(35);
		A1.accountDetails();
		AgainPracticeBankingSystem  A2 = new AgainPracticeBankingSystem(121, "ritik");
		A2.balance();
		A2.deposits(50);
		A2.withdraws(35);
		A2.accountDetails();

	}

}
