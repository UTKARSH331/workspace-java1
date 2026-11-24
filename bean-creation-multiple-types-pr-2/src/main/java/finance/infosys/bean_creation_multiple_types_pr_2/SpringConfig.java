package finance.infosys.bean_creation_multiple_types_pr_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages =  "finance.infosys.bean_creation_multiple_types_pr_2")
public class SpringConfig {
	@Bean("EMP1")
	public Employee employee() {
		return new Employee("Utk", "Raj");
	}
	@Bean("EMP2")
	public Employee employee21() {
		return new Employee("Utk1", "Raj1");
	}

}
