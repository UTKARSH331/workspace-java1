package com.comparator1;

import java.util.Comparator;

public class EmployeesalaryComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.salary, o2.salary);
	}

}
