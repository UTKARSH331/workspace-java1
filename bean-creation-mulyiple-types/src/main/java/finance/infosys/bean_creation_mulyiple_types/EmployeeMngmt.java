package finance.infosys.bean_creation_mulyiple_types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMngmt {
	@Autowired
	@Qualifier("EMP1")
	//@Qualifier("EMP2")
	Employee employee1;
	
	//@Qualifier("EMP2")
	//Employee employee2;
	
	public void displayEmployee() {
		System.out.println("employeemgnmt...displayDetaisl () start");
		employee1.display();
		
		//System.out.println("2nd employee2.dusplay start");
	//	employee2.display();
		
		//System.out.println("2nd employee2.display end");
		System.out.println("employeemngmt...displayDetaisl () end ");
	}
	

}
