package com.xworkz.copy.examples.onetomany;

public class Email {
	
	public String id;
	public String password;
	public long mobileNo;
	public Company company;
	
	public Email(String id, String password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	
	public void setCompany(Company company)
	{
		this.company = company;
	}
	
	public void showOff7() {
		
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		
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
