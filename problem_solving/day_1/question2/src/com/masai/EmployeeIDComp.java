package com.masai;

import java.util.Comparator;

public class EmployeeIDComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpId() > e2.getEmpId() ? +1 : -1;
	}
	
}
