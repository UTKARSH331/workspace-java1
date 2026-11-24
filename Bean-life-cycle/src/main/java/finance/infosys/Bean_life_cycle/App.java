package finance.infosys.Bean_life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.infosys.Bean.life.cycle.config.SpringConfig;
import finance.infosys.Bean.life.cycle.pojo.AccountMgmnt;


public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
         AccountMgmnt accountMgmnt =	(AccountMgmnt) context.getBean( AccountMgmnt.class);
         
         accountMgmnt.showInfo();
    	
    }
}
