package finance.infosys.Dependency_di;

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
    	ApplicationContext ioc  = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Employee emp = ioc.getBean(Employee.class);
    	System.out.println(" employe. displayemployee : " + emp.displayEmployee());
    }
    
    
}
