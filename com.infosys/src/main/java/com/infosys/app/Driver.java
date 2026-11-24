
package com.infosys.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.Employee;

public class Driver {

    public static void main(String[] args) {
    	
    	
    	String configPath = "beans.xml";

     ApplicationContext ioc = new ClassPathXmlApplicationContext(configPath);
     
      Employee emp =  (Employee) ioc.getBean("emp1");
      
      System.out.println(emp.getId());
      System.out.println(emp.getName());
     
       
    }
       
}
