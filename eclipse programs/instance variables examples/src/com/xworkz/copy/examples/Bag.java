package com.xworkz.copy.examples;

public class Bag {
	
	public String[] brand;
	public String[] color;
	public double[] price;
	public int warranty;
	public boolean adjustable;
	public boolean laptopCompatible;
	public String[] material;
	public boolean waterResistant;
	public double capacity;
	public String[] offers;
	public int[] quantity;
	
	public Bag(String[] brand,String[] color,double[] price,int warranty,boolean adjustable,boolean laptopCompatible, String[] material, boolean waterResistant,double capacity, String[] offers,int[] quantity) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.warranty=warranty;
		this.adjustable=adjustable;
		this.laptopCompatible=laptopCompatible;
		this.material=material;
		this.waterResistant=waterResistant;
		this.capacity=capacity;
		this.offers=offers;
		this.quantity=quantity;
		
	}
	
	public void display() {

		
        for (int i = 0; i < brand.length; i++) {
			
			String ref=this.brand[i];
			System.out.println(ref);
			
		}
		
		for (int i = 0; i < color.length; i++) {
			
			String ref=this.color[i];
			System.out.println(ref);
			
		}
       for (int i = 0; i < price.length; i++) {
			
			double ref=this.price[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.warranty);
		
		System.out.println(this.adjustable);
		
		System.out.println(this.laptopCompatible);
        for (int i = 0; i < material.length; i++) {
			
			String ref=this.material[i];
			System.out.println(ref);
			
		}
        
        System.out.println(this.waterResistant);
        
        System.out.println(this.capacity);
        
 
        for (int i = 0; i < offers.length; i++) {
			
			String ref=this.offers[i];
			System.out.println(ref);
			
		}
        
        for (int i = 0; i < quantity.length; i++) {
			
			int ref=this.quantity[i];
			System.out.println(ref);
			
		}
		
		
	}
}



