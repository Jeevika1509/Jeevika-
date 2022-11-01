package com.xworkz.copy.examples.onetomany;

public class Country1 {
	
	public String name;
	public String capital;
	public int noOfStates;
	public boolean developing;
	
	
	public Country1(String name, String capital, int noOfStates, boolean developing) {
		super();
		this.name = name;
		this.capital = capital;
		this.noOfStates = noOfStates;
		this.developing = developing;
	}
	
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.noOfStates);
		System.out.println(this.developing);
	}
	
	

}
