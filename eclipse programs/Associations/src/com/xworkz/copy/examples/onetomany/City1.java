package com.xworkz.copy.examples.onetomany;

public class City1 {
	
	public String name;
	public String area;
	public double areaInSquareKilometers;
	public int pincode;
	
	
	
	public City1(String name, String area, int pincode, double areaInSquareKilometers) {
		super();
		this.name = name;
		this.area = area;
		this.pincode = pincode;
		this.areaInSquareKilometers = areaInSquareKilometers;
	}
	
	public void showOff1() {
		
		System.out.println(this.name);
		System.out.println(this.area);
		System.out.println(this.areaInSquareKilometers);
		System.out.println(this.pincode);
	
	}
	
	
	

}
