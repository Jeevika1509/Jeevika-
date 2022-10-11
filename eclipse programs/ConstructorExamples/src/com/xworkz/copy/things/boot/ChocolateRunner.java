package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate chocolate=new Chocolate();
		System.out.println(chocolate.name);
		System.out.println(chocolate.brand);
		System.out.println(chocolate.price);
		System.out.println(chocolate.flavour);
		chocolate.name="Dairy milk";
		chocolate.brand="Cadbury";
		chocolate.flavour="Fruit and Nut";
		chocolate.price=80;
		System.out.println(chocolate.name);
		System.out.println(chocolate.brand);
		System.out.println(chocolate.price);
		System.out.println(chocolate.flavour);

	}

}
