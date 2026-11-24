package com.comparator1;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		int result = Integer.compare(o1.age, o2.age);
		return result;
	}

}
