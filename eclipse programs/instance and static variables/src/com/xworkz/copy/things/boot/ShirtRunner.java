package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		Shirt shirt=new Shirt("cotton");
		shirt.setPrice(1200);
		shirt.color="blue";
		shirt.display();
	}

}
