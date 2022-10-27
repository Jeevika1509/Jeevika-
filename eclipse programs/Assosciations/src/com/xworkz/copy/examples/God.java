package com.xworkz.copy.examples;

public class God {
	
	public String name;
	public String gender;
	public String mainPower;
	
	public Weapon weapon=new Weapon("trishula","divine symbol",130);

	public God(String name, String gender, String mainPower) {
		super();
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}
	
	public void display2() {
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.mainPower);
		weapon.display3();
		
		
	}
	

}
