package finance.infosys.CA_bean_ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Account acc = context.getBean(Account.class);
    	acc.displayAccountDetails();
    //	System.out.println();
    	
    }
}
