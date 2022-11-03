package com.xworkz.copy.examples;

public class MicroovenReadandModify {

	public Microoven microoven;
	
	public void useMicrooven(Microoven microoven) {
		System.out.println("microoven brand:"+microoven.getBrand());
	     microoven.setBrand("LG");
	     System.out.println("modified brand:"+microoven.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven color:"+microoven.getColor());
	     microoven.setColor("black");
	     System.out.println("modified color:"+microoven.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven price:"+microoven.getPrice());
	     microoven.setPrice(12800);
	     System.out.println("modified price:"+microoven.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven capacity:"+microoven.getCapacity());
	     microoven.setCapacity(42);
	     System.out.println("modified capacity:"+microoven.getCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven model no :"+microoven.getModelNumber());
	     microoven.setModelNumber(429);
	     System.out.println("modified model no:"+microoven.getModelNumber());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven length:"+microoven.getLength());
	     microoven.setLength(38);
	     System.out.println("modified length:"+microoven.getLength());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven width:"+microoven.getWidth());
	     microoven.setWidth(38);
	     System.out.println("modified width:"+microoven.getWidth());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven weight before modifying:"+microoven.getWeight());
	     microoven.setWeight(20);
	     System.out.println("modified weight:"+microoven.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven offers:"+microoven.getOffers());
	     microoven.setOffers("20 %");
	     System.out.println("modified offers:"+microoven.getOffers());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven warranty :"+microoven.getWarranty());
	     microoven.setWarranty(2);
	     System.out.println("modified warranty:"+microoven.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("microoven quantity:"+microoven.getQuantity());
	     microoven.setQuantity(2);
	     System.out.println("modified quantity:"+microoven.getQuantity());
	     
	}
	
}
