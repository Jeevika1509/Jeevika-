package com.xworkz.copy.examples;

public class Earphones {
	
	public String brand;
	public String[] color;
	public String[] conectorType;
	public int[] modelNo;
	public int[] quantity;
	public double weight;
	public int warranty;
	public String[] offers;
	public int[] price;
	public boolean working;
	public String material;
	
	public Earphones(String brand,String[] color,String[] connectorType,int[] modelNo,int[] quantity,double weight,int warranty,String[] offers,int[] price,boolean working,String material ) {
		this.brand=brand;
		this.color=color;
		this.conectorType=connectorType;
		this.modelNo=modelNo;
		this.quantity=quantity;
		this.weight=weight;
		this.warranty=warranty;
		this.offers=offers;
		this.price=price;
		this.working=working;
		this.material=material;
		
	}
	
	public void display() {

		System.out.println(this.brand);
		
		for (int i = 0; i < color.length; i++) {
				
				String ref=this.color[i];
				System.out.println(ref);
				
			}
	       
	    for (int i = 0; i < conectorType.length; i++) {
				
				String ref=this.conectorType[i];
				System.out.println(ref);
				
			}
	    for (int i = 0; i < modelNo.length; i++) {
			
			int ref=this.modelNo[i];
			System.out.println(ref);
			
		}
	    
	    for (int i = 0; i < quantity.length; i++) {
			
			int ref=this.quantity[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.weight);
		
		System.out.println(this.warranty);
		
		
		 for (int i = 0; i < offers.length; i++) {
				
				String ref=this.offers[i];
				System.out.println(ref);
				
			}
		 
		 for (int i = 0; i < price.length; i++) {
				
				int ref=this.price[i];
				System.out.println(ref);
				
			}
			       
		
		 System.out.println(this.working);
	     System.out.println(this.material);
	}
	   
	        

	
}
