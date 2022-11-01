package com.xworkz.copy.examples.onetomany;

public class Job {
	
	public double salary;
	public String role;
	public int bond;
	public Company company;
	
	public Job(double salary, String role, int bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	
	public void setCompany(Company company)
	{
		this.company = company;
	}
	
	public void showOff6() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		
		if(company!=null)
		{
			
			System.out.println("Company details:");
			this.company.showOff5();
			
		}
		else
		{
			System.out.println("it is a null value");
		}
	}
	
	

}
