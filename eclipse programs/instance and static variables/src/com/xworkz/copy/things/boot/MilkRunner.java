package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		Milk milk=new Milk(22);
		milk.setQuantity(1);
		milk.manufacturingDate="25th oct 2022";
		milk.display();

	}

}
