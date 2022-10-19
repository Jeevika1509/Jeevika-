package com.xworkz.copy.examples;

public class Watch {

	public String brand;
	public String[] modelno;
	public String[] type;
	public String[] color;
	public int[] price;
	public int warranty;
	public boolean working;
	public boolean waterResistant;
	public String[] material;
	public double weight;
	public boolean offers;
	
	public Watch(String brand,String[] modelno,String[] type,String[] color,int[] price,int warranty,boolean working,boolean waterResistant, String[] material,double weight,boolean offers ) {
		this.brand=brand;
		this.modelno=modelno;
		this.type=type;
		this.color=color;
		this.price=price;
		this.warranty=warranty;
		this.working=working;
		this.waterResistant=waterResistant;
		this.material=material;
		this.weight =weight;
		this.offers=offers;
		
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
	     System.out.println(this.waterResistant);
		
		
       for (int i = 0; i < material.length; i++) {
			
			String ref=this.material[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.weight);
		
		System.out.println(this.offers);
		
	}
	

	
	
	
	
}
