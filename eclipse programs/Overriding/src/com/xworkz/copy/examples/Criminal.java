package com.xworkz.copy.examples;

public class Criminal {
	
	public String crime;
	public boolean punishable;
	public Criminal(String crime, boolean punishable) {
		super();
		this.crime = crime;
		this.punishable = punishable;
	}
	
	public void display() {
		System.out.println(this.crime);
		System.out.println(this.punishable);
	}
	

}
