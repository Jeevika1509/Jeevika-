package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		
		Cracker cracker=new Cracker(250);
		cracker.setQuantity(10);
		cracker.burst=false;
		cracker.display();


	}

}
