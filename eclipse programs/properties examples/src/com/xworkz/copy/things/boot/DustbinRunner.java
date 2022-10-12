package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Dustbin;

public class DustbinRunner {
	
	public static void main(String[] args)
	{
		Dustbin dustbin=new Dustbin();
		
		System.out.println(dustbin.color);
		System.out.println(dustbin.shape);
		System.out.println(dustbin.price);
		System.out.println(dustbin.type);
		System.out.println(dustbin.brand);
		System.out.println(dustbin.capacity);
		System.out.println(dustbin.material);
		System.out.println(dustbin.quantity);
		System.out.println(dustbin.size);
		dustbin.category="dry waste";
		dustbin.quantity=1;
		dustbin.weight=1152;
		dustbin.length=10;
		dustbin.width=30;
		dustbin.height=32.6f;
		dustbin.lightWeight=true;
		dustbin.durable=true;
		dustbin.pedal="yes";
		System.out.println(dustbin.category);
	    System.out.println(dustbin.quantity);
	    System.out.println(dustbin.weight);
	    System.out.println(dustbin.length);
	    System.out.println(dustbin.width);
	    System.out.println(dustbin.height);
	    System.out.println(dustbin.lightWeight);
	    System.out.println(dustbin.durable);
	    System.out.println(dustbin.pedal);
	}

}