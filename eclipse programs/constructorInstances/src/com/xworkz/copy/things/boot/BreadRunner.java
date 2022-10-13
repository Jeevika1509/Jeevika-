package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		
		Bread bread=new Bread();
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		bread=new Bread("white bread");
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		bread=new Bread(33);
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		bread=new Bread(400);
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		bread=new Bread("square","Britannia");
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		bread=new Bread("brown bread",40);
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		bread=new Bread(33,400);
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		bread=new Bread(40,"square");
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		

	}

}
