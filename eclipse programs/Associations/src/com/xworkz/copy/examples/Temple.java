package com.xworkz.copy.examples;

public class Temple {
	
	public String name;
	public String mainPriest;
	public int noOfVisitors;
	public double collectionPerDay;
	
	public God god=new God("Shiva","male","protection");

	public Temple(String name, String mainPriest, int noOfVisitors, double collectionPerDay) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitors = noOfVisitors;
		this.collectionPerDay = collectionPerDay;
	}
	
	public void display1() {
		
		System.out.println(this.name);
		System.out.println(this.mainPriest);
		System.out.println(this.noOfVisitors);
		System.out.println(this.collectionPerDay);
		god.display2();
		
	}

}
