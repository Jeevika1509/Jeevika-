package com.xworkz.copy.things;

public class Bread {
	
	public String type;
	public String shape;
	public int price;
	public float quantity;
	public String companyName;
	
	public Bread() {
		System.out.println("constructor with no arguments");
	}
	
	public Bread(String type) {
		this.type=type;
	}
	
	public Bread(int price) {
		this.price=price;
	}
	
	public Bread(float quantity) {
		this.quantity=quantity;
	}
	
	public Bread(String shape,String companyName) {
		this.shape=shape;
		this.companyName=companyName;
	}
	
	public Bread(String type,int price) {
		this.type=type;
		this.price=price;
	}
	
	public Bread(int price,float quantity) {
		this.price=price;
		this.quantity=quantity;
	}
	
	public Bread(int price,String shape) {
		this.price=price;
		this.shape=shape;
		
	}

}
