package com.xworkz.examples.boot;

import com.xworkz.examples.Company;
import com.xworkz.examples.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {

		Employee employee=new Employee();
		employee.completeTasks();
		employee.dressCode();
		employee.idcard();
		employee.workingHours();
		employee.hasBreak();
		
		System.out.println(System.lineSeparator());
		Company rules=new Employee();
		rules.completeTasks();
		rules.dressCode();
		rules.hasBreak();
		rules.idcard();
		rules.workingHours();
	}

}
