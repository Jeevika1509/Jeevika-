package com.xworkz.copy.examples;

import com.xworkz.copy.examples.boot.Shape.Shape;

public class Pillar {
	
	public int id;
	public String place;
	public Shape shape;
	public double height;
	public String supporting;
	public Company company=new Company("tata",'T');
	
	public Pillar()
	{
		
	}
	
	
	public Pillar(int id, String place, Shape shape, double height, String supporting) {
		super();
		this.id = id;
		this.place = place;
		this.shape = shape;
		this.height = height;
		this.supporting = supporting;
		
		if(company!=null) {
			this.company.showOff();
		}
		
		else {
			System.out.println("it is null");
		}
	}


	public void show() {
		
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.shape);
		System.out.println(this.height);
		System.out.println(this.supporting);
		company.showOff();
	}
}
