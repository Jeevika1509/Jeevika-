package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		Flower flower=new Flower(50);
		flower.setQuantity(10);
		flower.weight=100;
		flower.display();


	}

}
