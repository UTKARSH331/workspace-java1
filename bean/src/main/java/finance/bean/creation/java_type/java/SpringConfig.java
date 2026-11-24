package finance.bean.creation.java_type.java;

import org.springframework.context.annotation.Bean;

import finance.bean.creation.java_type.employee.Employee;

public class SpringConfig 
{
	@Bean("emp1")	
public Employee createEmp()

{
	
	Employee employee = new Employee();
	
	employee.setBrand("B1");
	employee.setId("Kw123");
	employee.setName("Kodewala");
	
	return employee;
}
	
	@Bean("emp2")	
public Employee createEmp1()

{
	
	Employee employee = new Employee();
	
	employee.setBrand("B1");
	employee.setId("Kw123");
	employee.setName("Kodewala Academy, BTM, Banglore");
	
	return employee;
}

}
