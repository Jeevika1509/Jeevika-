package com.xworkz.copy.things.boot;
import com.xworkz.copy.things.Boat;


public class BoatRunner {

	public static void main(String[] args) {
		
		Boat boat=new Boat();
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		boat=new Boat("Destiny");
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		boat=new Boat("blue","American skier");
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		boat=new Boat( "tournament","Ken Elkind","American Skier");
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		boat=new Boat("white","maxum","fiberglass","Brunswick");
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		boat=new Boat("gray","mastercraft","powerboat","Fred Brightbill","mastercraft boat holdings");
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		

	}

}
