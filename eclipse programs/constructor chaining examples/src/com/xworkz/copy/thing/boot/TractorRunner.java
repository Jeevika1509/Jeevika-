package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
	
		Tractor tractor=new Tractor();
		
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.price);
		System.out.println(tractor.color);
		System.out.println(tractor.hp);
		System.out.println(tractor.model);
	
		tractor=new Tractor("Mahindra");
		System.out.println("Tractor name is:"+tractor.name);
		
		tractor=new Tractor("Swaraj",345000);
		System.out.println("Tractor name is:"+tractor.name);
		System.out.println("Tractor price:"+tractor.price);
		
		tractor=new Tractor("force motors","white");
		System.out.println("Tractor brand is:"+tractor.brand);
		System.out.println("Tractor color:"+tractor.color);
		
		tractor=new Tractor("Tafe Motors","red",35);
		System.out.println("Tractor brand is:"+tractor.brand);
		System.out.println("Tractor color:"+tractor.color);
		System.out.println("Tractor hp:"+tractor.hp);
		
		tractor=new Tractor("Sonalika Tractor","blue","Sikander DI 35");
		System.out.println("Tractor brand is:"+tractor.brand);
		System.out.println("Tractor color:"+tractor.color);
		System.out.println("Tractor model is:"+tractor.model);
	

	}

}
