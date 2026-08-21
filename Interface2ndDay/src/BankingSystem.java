
public interface BankingSystem {
	public abstract void payment();
	public abstract void transaction();
	public abstract void cashWithdrawl();
	public default void passBook() {
		System.out.println("default mrthod for backward compatibility ");
	}
		
	
	

}
