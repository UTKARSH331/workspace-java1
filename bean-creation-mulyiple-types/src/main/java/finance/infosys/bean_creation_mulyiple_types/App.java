package finance.infosys.bean_creation_mulyiple_types;

//import java.applet.AppletContext;

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
    	
    	ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	 EmployeeMngmt emp = ioc.getBean(EmployeeMngmt.class);
        
    	 emp.displayEmployee();
    }
}
