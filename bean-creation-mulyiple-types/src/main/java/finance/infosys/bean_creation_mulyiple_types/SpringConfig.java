package finance.infosys.bean_creation_mulyiple_types;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan (basePackages = "finance.infosys.bean_creation_mulyiple_types")
// copy packages from the app.java in componentscan
public class SpringConfig {
	@Bean("EMP1")
	public Employee employee(){
		return new Employee("Utk", "Raj");
	}
	@Bean("EMP2")
	@Primary
	public Employee employee2() {
		return new Employee("New Kodewala", "Academy");
	}
	
	

}
// what is github
// how to do debug
// what is the software lifecycle
// what to do after getting in it