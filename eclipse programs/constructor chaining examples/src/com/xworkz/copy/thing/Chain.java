package com.xworkz.copy.thing;

public class Chain {

	public String type;
	public float price;
	public float length;
	public String material;
	public float weight;
	public boolean stolen;
	public String usedFor;
	public String fresh;
	
	public Chain() {
		System.out.println("Constructor with no arguments");
	}
	
	public Chain(String type) {
		this.type=type;
	}
	
	public Chain(String type,float price) {
		this(type);
		this.price=price;
	}
	
	public Chain(String type,float price,float length) {
		this(type,price);
		this.length=length;
	}
	
	public Chain(String type,float price,float length,String material) {
		this(type,price,length);
		this.material=material;
	}
	public Chain(String type,float price,float length,String material,float weight) {
		this(type,price,length,material);
		this.weight=weight;
	}
	
	public Chain(String type,float price,float length,String material,float weight,boolean stolen) {
		this(type,price,length,material,weight);
		this.stolen=stolen;
	}
	
	public Chain(String type,float price,float length,String material,float weight,boolean stolen,String usedFor) {
		this(type,price,length,material,weight,stolen);
		this.usedFor=usedFor;
	}
	
	public Chain(String type,float price,float length,String material,float weight,boolean stolen,String usedFor,String fresh) {
		this(type,price,length,material,weight,stolen,usedFor);
		this.fresh=fresh;
	}
}
