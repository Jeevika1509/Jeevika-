package com.xworkz.copy.examples;

public class GeyserReadandModify {
	
	public Geyser geyser;
	
	public void useGeyser(Geyser geyser) {
		
		System.out.println("geyser brand:"+geyser.getBrand());
	     geyser.setBrand("bajaj");
	     System.out.println("modified brand:"+geyser.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser color:"+geyser.getColor());
	     geyser.setColor("blue");
	     System.out.println("modified color:"+geyser.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser price:"+geyser.getPrice());
	     geyser.setPrice(3800);
	     System.out.println("modified price:"+geyser.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser capacity:"+geyser.getCapacity());
	     geyser.setCapacity(10);
	     System.out.println("modified capacity:"+geyser.getCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser model no :"+geyser.getModelNumber());
	     geyser.setModelNumber(4373);
	     System.out.println("modified model no:"+geyser.getModelNumber());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser length:"+geyser.getLength());
	     geyser.setLength(38);
	     System.out.println("modified length:"+geyser.getLength());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser width:"+geyser.getWidth());
	     geyser.setWidth(23);
	     System.out.println("modified width:"+geyser.getWidth());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser weight:"+geyser.getWeight());
	     geyser.setWeight(2000);
	     System.out.println("modified weight:"+geyser.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser offers:"+geyser.isOffers());
	     geyser.setOffers(false);
	     System.out.println("modified offers:"+geyser.isOffers());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser warranty:"+geyser.getWarranty());
	     geyser.setWarranty(2);
	     System.out.println("modified warranty:"+geyser.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("geyser quantity:"+geyser.getQuantity());
	     geyser.setQuantity(2);
	     System.out.println("modified quantity:"+geyser.getQuantity());
	     
	}

}
