package finance.infosys.Dependency_di.field;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee3 {

	String line1;
	String city;
	String state;
	
	@Autowired
	Address3 address3;

//	@Override
	public String displayEmployee() {
		return "Employee3 [line1=" + line1 + ", city=" + city + ", state=" + state + ", address3=" + address3 + address3.displayAddress() +  "]";
	}
	

    
	
	
}
