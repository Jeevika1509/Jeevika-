package com.xworkz.copy.examples.onetomany;

public class Company {
	
	public String name;
	public String ownerName;
	public Address address;
	
	
	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	
	public void showOff5() {
		
		System.out.println(this.name);
		System.out.println(this.ownerName);
		
		
		if(address!=null)
		{
			
			System.out.println("Location details:");
			this.address.showOff4();
			
		}
		else
		{
			System.out.println("it is a null value");
		}
	}
	

}
