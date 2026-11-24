package finance.bean.creation.java_type;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.bean.creation.java_type.employee.Employee;
import finance.bean.creation.java_type.java.SpringConfig;

//import java.applet.AppletContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

      System.out.println("all spring config started");
      
      
    ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
    
      Employee emp  = (Employee) ioc.getBean("emp1");
      
      System.out.println(emp.toString());
      
      
    	
    }
}
