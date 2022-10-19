package com.xworkz.copy.examples;

public class Tyre {
	
	public String brand;
	public String[] modelno;
	public String[] type;
	public String color;
	public double weight;
	public int[] price;
	public int[] quantity;
	public float[] loadCapacity;
	public float length;
	public float width;
	public float height;
	public String[] material;
	
	public Tyre(String brand,String[] modelno,String[] type,String color,double weight,int[] price,int[] quantity,float[] loadCapacity,float length,float width,float height,String[] material ) {
		this.brand=brand;
		this.modelno=modelno;
		this.type=type;
		this.color=color;
		this.weight=weight;
		this.price=price;
		this.quantity=quantity;
		this.loadCapacity=loadCapacity;
		this.length=length;
		this.width=width;
		this.height=height;
		this.material=material;
		
	}
	
	public void display() {

		System.out.println(this.brand);
		
		for (int i = 0; i < modelno.length; i++) {
				
				String ref=this.modelno[i];
				System.out.println(ref);
				
			}
	       
	    for (int i = 0; i < type.length; i++) {
				
				String ref=this.type[i];
				System.out.println(ref);
				
			}
		
		System.out.println(this.color);
		
		System.out.println(this.weight);
		
		 for (int i = 0; i < price.length; i++) {
				
				int ref=this.price[i];
				System.out.println(ref);
				
			}
     
       
		for (int i = 0; i < quantity.length; i++) {
			
			int ref=this.quantity[i];
			System.out.println(ref);
			
		}
		
		 for (int i = 0; i < loadCapacity.length; i++) {
				
				double ref=this.loadCapacity[i];
				System.out.println(ref);
				
			}
			       
		
		 System.out.println(this.length);
	     System.out.println(this.width);
	     System.out.println(this.height);
	    
	     for (int i = 0; i < material.length; i++) {
				
				String ref=this.material[i];
				System.out.println(ref);
				
			}
	     
	     
	}
	
	
}
