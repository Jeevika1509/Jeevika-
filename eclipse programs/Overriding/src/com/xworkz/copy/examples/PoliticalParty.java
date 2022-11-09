package com.xworkz.copy.examples;

public class PoliticalParty {
	
	public int members;
	public String location;
	public PoliticalParty(int members, String location) {
		super();
		this.members = members;
		this.location = location;
	}
	
	public void display() {
		System.out.println(this.members);
		System.out.println(this.location);
	}

}
