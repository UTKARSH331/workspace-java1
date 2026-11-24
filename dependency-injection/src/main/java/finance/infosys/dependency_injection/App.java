package finance.infosys.dependency_injection;

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
    	//@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
		Employee emp = context.getBean(Employee.class);

		System.out.println(emp);
		
    }
    
    
    
}
