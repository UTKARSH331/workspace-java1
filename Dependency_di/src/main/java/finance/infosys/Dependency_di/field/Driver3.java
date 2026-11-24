package finance.infosys.Dependency_di.field;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AppletContext ioc = new AnnotationA
		ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfigField.class);
		
		 Employee3 emp = ioc.getBean(Employee3.class);
		 
		 System.out.println("emp.displayEmployee : " + emp.displayEmployee());

	}

}
