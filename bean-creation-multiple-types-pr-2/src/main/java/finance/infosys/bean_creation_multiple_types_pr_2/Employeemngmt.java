package finance.infosys.bean_creation_multiple_types_pr_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employeemngmt {
	
	@Autowired
	@Qualifier("EMP2")
	Employee employee;
	
	public void displayEmployee() {
		System.out.println("starting of employeemngmt");
		
		employee.display();
		
		System.out.println("ending of empoyeemngmt");
	}
	
	

}
