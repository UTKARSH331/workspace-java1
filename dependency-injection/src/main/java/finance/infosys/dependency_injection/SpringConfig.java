package finance.infosys.dependency_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {

	@Bean
	public Address1 address() {
		return new Address1("17th main road", "26th cross", "BTM", "Banglore");
	}
	@Bean
	public Employee employee() {
		return new Employee("Kodewala", "Academy", "Km123", address());
	}
	
}
