package com.comparator1;

import java.util.Comparator;

public class EmployeeDepartmentComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.department.compareTo(o2.department);
	}

}
