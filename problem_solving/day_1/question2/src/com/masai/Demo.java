package com.masai;

import java.util.Scanner;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeIDComp idComp = new EmployeeIDComp();
		EmployeeAddressComp addComp = new EmployeeAddressComp();
		EmployeeSalaryComp salaryComp = new EmployeeSalaryComp();
		TreeSet<Employee> emp;
		System.out.println("Enter a number for sorting (1:Sort By EmpID , 2:Sort By Address, 3:Sort By Salary) : ");
		int n = sc.nextInt();
		
		if(n == 1) {
			emp = new TreeSet<>(idComp);
		}else if(n == 2) {
			emp = new TreeSet<>(addComp);
		}else {
			emp = new TreeSet<>(salaryComp);
		}
		
		
		
		emp.add(new Employee(10, "Smita","Odisha", 500));
		emp.add(new Employee(11, "Ankush","Bihar", 550));
		emp.add(new Employee(12, "Albert","Maharastra", 580));
		emp.add(new Employee(13, "Sourav","Kerala", 400));
		emp.add(new Employee(14, "Jagdish","Delhi", 550));
		emp.add(new Employee(10, "Nitin","Gujurat", 500));
		
		for (Employee employee : emp) {
			System.out.println(employee);
		}
	}
}
