package com.xworkz.copy.examples;

public class Ravi extends Criminal{
	
	public boolean jail;

	public Ravi(String crime, boolean punishable,boolean jail) {
		super(crime, punishable);
		this.jail=jail;
		
	}
	
	public void display() {
		
		super.display();
		System.out.println(this.jail);
	}
	
	

}
