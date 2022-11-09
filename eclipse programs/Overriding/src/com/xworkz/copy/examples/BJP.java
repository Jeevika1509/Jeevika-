package com.xworkz.copy.examples;

public class BJP extends PoliticalParty {
	
	public String logo;

	public BJP(int members, String location,String logo) {
		super(members, location);
		this.logo=logo;
		
	}
	
	public void display() {
		super.display();
		System.out.println(this.logo);
	}
	
	
	

}
