package finance.infosys.Bean.life.cycle.pojo;

public class Account 
{

	String accountId = "129878";
	String accountName = "Utk";
	public Account() {
		super();
		//this.accountId = accountId;
		//this.accountName = accountName;
	}
//	@Override
	public void displayDetails() {
		String accountInfo =  "Account [accountId=" + accountId + ", accountName=" + accountName + "]";
		
		System.out.println(accountInfo);
	}
		
}
