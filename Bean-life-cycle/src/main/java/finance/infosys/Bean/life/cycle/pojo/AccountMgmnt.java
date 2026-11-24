package finance.infosys.Bean.life.cycle.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMgmnt {
	
	
	@Autowired
	Account account;
	
	public void showInfo() {
		System.out.println("reading in AccountMgmnt is started");
		
		account.displayDetails();
		
		System.out.println("reading in AccountMgmnt is completed");
	}
	

}
