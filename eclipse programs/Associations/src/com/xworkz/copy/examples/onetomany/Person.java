package com.xworkz.copy.examples.onetomany;

public class Person {
	
	public String name;
	public Email[] email;
	public Job job;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void setEmail(Email[] email)
	{
		this.email = email;
	}
	
	public void setJob(Job job) {
		this.job=job;
	}
	
	public void showOff8() {
		
		System.out.println(this.name);
		
		if (email!=null)
		{
		
			for (int i = 0; i < email.length; i++)
			{
				Email emails = email[i];	
				
				
				if(emails!=null)
				{
					System.out.println("Email details");
					emails.showOff7();
				}
			}
		}
			else
			{
				System.out.println("it is a null value");
			}
		
		
		if(job!=null)
		{
			
			System.out.println("Job details:");
			this.job.showOff6();
			
		}
		else
		{
			System.out.println("it is a null value");
		}
	}
	

}
