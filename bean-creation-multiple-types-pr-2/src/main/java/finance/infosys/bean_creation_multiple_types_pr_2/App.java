package finance.infosys.bean_creation_multiple_types_pr_2;

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
       // System.out.println( "Hello World!" );
    	ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	      Employeemngmt empmngmt = ioc.getBean(Employeemngmt.class);
    	      
    	      empmngmt.displayEmployee();
    	
    }
}
