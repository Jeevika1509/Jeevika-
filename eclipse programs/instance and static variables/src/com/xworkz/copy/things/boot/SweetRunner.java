package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		Sweet sweet=new Sweet("motichur laddu");
		sweet.setPrice(10);
		sweet.color="orange";
		sweet.display();

	}

}
