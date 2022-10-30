package com.xworkz.copy.examples;

import com.xworkz.copy.examples.boot.Gender.Gender;

public class President {

	public String name;
	public int tenure = 5;
	public Gender gender;
	
	
	public President (String name)
	{
		this.name = name;
	}
	
	

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	
	
	public void showOff()
	{
		
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.tenure);
		
		if(gender!=null)
		{
			System.out.println(this.gender);
		}
		
		
	}
	
	
}
