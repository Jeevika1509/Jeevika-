package com.xworkz.copy.examples;

public class Brand {
	
	public String name;
	public int gstNo;
	public double rating;
	public Location location=new Location("rr nagar",560098);
	
	
	public Brand() {
		
	}

	public Brand(String name, int gstNo,double rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
		
		if(location!=null) {
			this.location.display();
		}
		
		else {
			System.out.println("it is null");
		}
	}
	
	public void showOff() {
		
		System.out.println(this.name);
		System.out.println(this.gstNo);
		System.out.println(this.rating);
		location.display();
		
	}

}
