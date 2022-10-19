package com.xworkz.copy.examples;

public class Bulb {
	
	public String brand;
	public String[] color;
	public String[] modelno;
	public String[] type;
	public int[] price;
	public int warranty;
	public boolean working;
	public int[] quantity;
	public double weight;
	public String[] material;
	public boolean offers;
	

	public Bulb(String brand,String[] color,String[] modelno,String[] type,int[] price,int warranty,boolean working,int[] quantity, double weight,String[] material,boolean offers ) {
		this.brand=brand;
		this.color=color;
		this.modelno=modelno;
		this.type=type;
		this.price=price;
		this.warranty=warranty;
		this.working=working;
		this.quantity=quantity;
		this.weight=weight;
		this.material=material;
		this.offers=offers;
		
	}
	
	public void display() {

		System.out.println(this.brand);
		
		for (int i = 0; i < color.length; i++) {
			
			String ref=this.color[i];
			System.out.println(ref);
			
		}
        for (int i = 0; i < modelno.length; i++) {
			
			String ref=this.modelno[i];
			System.out.println(ref);
			
		}
       
        for (int i = 0; i < type.length; i++) {
			
			String ref=this.type[i];
			System.out.println(ref);
			
		}
       
		for (int i = 0; i < color.length; i++) {
			
			String ref=this.color[i];
			System.out.println(ref);
			
		}
		
		 for (int i = 0; i < price.length; i++) {
				
				int ref=this.price[i];
				System.out.println(ref);
				
			}
	       
		
		 System.out.println(this.warranty);
	     System.out.println(this.working);
	     
		
       for (int i = 0; i < quantity.length; i++) {
			
			int ref=this.quantity[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.weight);
		
		for (int i = 0; i < material.length; i++) {
			
			String ref=this.material[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.offers);
		
	}
	

	


}
