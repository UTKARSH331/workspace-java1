package finance.infosys.Bean.life.cycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import finance.infosys.Bean.life.cycle.pojo.Account;
import finance.infosys.Bean.life.cycle.pojo.AccountMgmnt;

@Configuration
@ComponentScan (basePackages =  "finance.infosys.Bean.life.cycle.pojo")
public class SpringConfig 
{	
	@Bean("account21")
	public Account account2() {
		return new Account();
	}
		
}
