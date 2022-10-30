package com.xworkz.copy.examples;

public class City {

	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;
	
	
	public City(Name name,boolean capital,double areaInSquareKilometers)
	
	{
		this.capital = capital;
		this.areaInSquareKilometers = areaInSquareKilometers;
		this.name = name;
	}
	
	
	
	public void show()
	{
		System.out.println(this.capital);
		System.out.println(this.areaInSquareKilometers);
		if(name!=null)
		{
		
			this.name.display1();
			System.out.println(System.lineSeparator());
			
		}
		
		else
		{
			System.out.println("it is a null value");
		}
	}
}
