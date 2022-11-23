package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Lipstick;

public class LipstickRunner {

	public static void main(String[] args) {
		
		Lipstick lipstick=new Lipstick();
		lipstick.setBrand("Lakme");
		lipstick.setColor("red");
		lipstick.setCountryOfOrigin("India");
		lipstick.setExpiryDate("2 years");
		lipstick.setModelNo("LLVV100");
		lipstick.setOffers(true);
		lipstick.setPrice(500);
		lipstick.setQuantity(1);
		lipstick.setType("matte");
		lipstick.setWeight(25);
		
		Lipstick lipstick2=new Lipstick("maybelline","pink",390,1,true,"CSULS399","china","matte","2 years",11.7);
		boolean same=lipstick.equals(lipstick2);
		System.out.println(same);

	}

}
