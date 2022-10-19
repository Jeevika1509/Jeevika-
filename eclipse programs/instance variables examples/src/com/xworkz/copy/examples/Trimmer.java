package com.xworkz.copy.examples;

public class Trimmer {
	
	public String brand;
	public String[] color;
	public String[] type;
	public int[] price;
	public boolean working;
	public int warranty;
	public int[] quantity;
	public double weight;
	public String material;
	public String[] modelno;
	public float length;
	public float width;
	public float height;
	
	public Trimmer(String brand,String[] color,String[] type,int[] price,boolean working,int warranty,int[] quantity,double weight,String material,String[] modelno,float length,float width,float height ) {
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.price=price;
		this.working=working;
		this.warranty=warranty;
		this.quantity=quantity;
		this.weight=weight;
		this.material=material;
		this.modelno=modelno;
		this.length=length;
		this.width=width;
		this.height=height;
		
	}

	public void display() {

		System.out.println(this.brand);
		
		for (int i = 0; i < color.length; i++) {
				
				String ref=this.color[i];
				System.out.println(ref);
				
			}
	       
	    for (int i = 0; i < type.length; i++) {
				
				String ref=this.type[i];
				System.out.println(ref);
				
			}
	    for (int i = 0; i < price.length; i++) {
			
			int ref=this.price[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.working);
		
		System.out.println(this.warranty);
		
		
     
       
		for (int i = 0; i < quantity.length; i++) {
			
			int ref=this.quantity[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.weight);
		
		System.out.println(this.material);
		 
		 for (int i = 0; i < modelno.length; i++) {
				
				String ref=this.modelno[i];
				System.out.println(ref);
				
			}
			       
		
		 System.out.println(this.length);
	     System.out.println(this.width);
	     System.out.println(this.height);
	        
	}
}
