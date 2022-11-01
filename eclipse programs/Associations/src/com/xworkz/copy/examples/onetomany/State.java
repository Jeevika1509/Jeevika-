package com.xworkz.copy.examples.onetomany;

public class State {

	public String oldName;
	public String newName;
	public String capital;
	public String country;
	public State(String oldName, String newName, String capital, String country) {
		super();
		this.oldName = oldName;
		this.newName = newName;
		this.capital = capital;
		this.country = country;
	}
	
	public void showOff2() {
		
		System.out.println(this.oldName);
		System.out.println(this.newName);
		System.out.println(this.capital);
		System.out.println(this.country);
	}
	
	
}
