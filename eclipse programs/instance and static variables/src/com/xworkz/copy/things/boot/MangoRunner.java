package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		Mango mango=new Mango(120);
		mango.setQuantity(10);
		mango.quality="good";
		mango.display();

	}

}
