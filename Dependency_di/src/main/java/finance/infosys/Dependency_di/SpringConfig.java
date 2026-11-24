package finance.infosys.Dependency_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public Address1 address() {
		return new Address1("26th cross", "Btm", "Banglore", "Indiaaaa");
	}
	@Bean
	public Employee emp() {
		return new Employee("UTK", "RAJ", address());
	}
	
	

}
