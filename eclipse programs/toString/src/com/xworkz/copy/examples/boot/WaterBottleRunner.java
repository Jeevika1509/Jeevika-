package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		WaterBottle waterBottle=new WaterBottle();
		waterBottle.setBrand("Tupperware");
		waterBottle.setColor("blue");
		waterBottle.setCapacity("750 ml");
		waterBottle.setDurable("yes");
		waterBottle.setMaterial("plastic");
		waterBottle.setPrice(200);
		waterBottle.setQuantity(1);
		waterBottle.setReusable("yes");
		waterBottle.setType("flip top");
		waterBottle.setWeight("700g");
		
		WaterBottle waterBottle2=new WaterBottle("milton","silver",340,"stainless steel","950 ml","yes",1,"yes","187 g","steel bottle");
		boolean same=waterBottle.equals(waterBottle2);
		System.out.println(same);

	}

}
