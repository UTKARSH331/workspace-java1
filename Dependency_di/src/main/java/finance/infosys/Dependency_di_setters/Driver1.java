package finance.infosys.Dependency_di_setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver1 {
	
	public static void main(String[] args) {
		ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Employee emp = ioc.getBean(Employee.class);
		
		System.out.println("emp.display :" + emp.displayEmployee());
				
	}

}
