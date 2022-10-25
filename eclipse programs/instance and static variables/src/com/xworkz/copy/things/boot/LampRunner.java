package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		Lamp lamp=new Lamp(1000);
		lamp.setQuantity(30);
		lamp.type="table lamp";
		lamp.display();

	}

}
