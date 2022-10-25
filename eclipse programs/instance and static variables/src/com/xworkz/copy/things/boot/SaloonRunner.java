package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {
		Saloon saloon=new Saloon(600);
		saloon.setOffers(true);
		saloon.haircut="layer";
		saloon.display();


	}

}
