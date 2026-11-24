package finance.infosys.CA_bean_ioc_container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =  "finance.infosys.CA_bean_ioc_container")
public class SpringConfig {
	
	@Bean
	public Account account() {
		return new Account("UTK", 123);
	}
	
	

}
