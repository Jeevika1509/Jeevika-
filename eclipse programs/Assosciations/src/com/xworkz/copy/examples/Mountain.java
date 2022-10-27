package com.xworkz.copy.examples;

public class Mountain {

	public String name;
	public double height;
	
	public Locations locations=new Locations("Gaurikund ","rudraprayag","uttarkhand",246445,"India");
	public Temple temple=new Temple("kedarnath","Bheem Shanker",1000000,5674849);
	
	public Mountain() {
		
	}

	public Mountain(String name, double height) {
		super();
		this.name = name;
		this.height = height;
		
		if(locations!=null) {
			this.locations.showOff();
		}
		
		else {
			System.out.println("it is null");
		}
		
		if(temple!=null) {
			this.temple.display1();
		}
		
		else {
			System.out.println("it is null");
		}
	}
	
	public void show()
	{
		System.out.println(this.name);
		System.out.println(this.height);
		locations.showOff();
		temple.display1();
		
		
	}
}
