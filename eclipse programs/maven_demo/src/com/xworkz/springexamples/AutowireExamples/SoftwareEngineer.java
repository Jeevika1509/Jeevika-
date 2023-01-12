package com.xworkz.springexamples.AutowireExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	
	@Autowired
	@Qualifier("engineerName")
	private String name;
	@Autowired
	@Qualifier("amount")
	private double salary;
	@Autowired
	@Qualifier("companyName")
	private String company;
	@Autowired
	@Qualifier("years")
	private double experience;
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", company=" + company + ", experience="
				+ experience + "]";
	}
	

}
