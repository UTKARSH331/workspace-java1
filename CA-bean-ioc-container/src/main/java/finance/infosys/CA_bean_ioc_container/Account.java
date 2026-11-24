package finance.infosys.CA_bean_ioc_container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Account {
String accName;
int  accId;
public Account(String accName, int accId) {
	super();
	this.accName = accName;
	this.accId = accId;
}

@Autowired
@Qualifier
AccountServices account;

//@Override
public void displayAccountDetails() {
	//String data = "Account [accName=" + accName + ", accId=" + accId + "]";
//	System.out.println(data);
	System.out.println("accountServises started......");
	
	account.accountServicesDetails();
	
	System.out.println("accountServises ended......");
	
}

}
