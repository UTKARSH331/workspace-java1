package finance.infosys.Dependency_di_setters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	public Address1 address() {
		return new Address1("26th cross", "BTM", "Banglore", "indiaaaaa1a");
	}
	@Bean 
	public Employee employee() { 
		Employee employee = new Employee("Utk", "Raj");
		employee.getDisplayAddress( address()) ;
		return employee;
	}
	
	

}
