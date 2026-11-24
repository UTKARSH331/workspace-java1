package finance.infosys.Dependency_di.field;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfigField {
	@Bean
	public Address3 address() {
		return new Address3("26th cross", "Blr", "Blr");
	
	}
	@Bean
	public Employee3 employeee() {
		Employee3 emp = new Employee3();
		return emp;
	}
	

}
