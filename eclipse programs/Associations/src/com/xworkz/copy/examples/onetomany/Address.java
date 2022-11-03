package com.xworkz.copy.examples.onetomany;

public class Address {
	
	public Location location;
	
	public Address(Location location) {
		this.location=location;
		
	}


	
	public void showOff4() {
		
		if(location!=null)
		{
			
			System.out.println("Location details:");
			this.location.showOff3();
			
		}
		else
		{
			System.out.println("it is a null value");
		}
	}

}
