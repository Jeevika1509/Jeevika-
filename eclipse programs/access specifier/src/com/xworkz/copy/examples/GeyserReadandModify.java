package com.xworkz.copy.examples;

public class GeyserReadandModify {
	
	public Geyser geyser;
	
	public void useGeyser(Geyser geyser) {
		
		System.out.println("accessing geyser brand before modifying:"+geyser.brand);
	     geyser.setBrand("bajaj");
	     System.out.println("modified brand:"+geyser.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser color before modifying:"+geyser.color);
	     geyser.setColor("blue");
	     System.out.println("modified color:"+geyser.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser price before modifying:"+geyser.price);
	     geyser.setPrice(3800);
	     System.out.println("modified price:"+geyser.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser capacity before modifying:"+geyser.capacity);
	     geyser.setCapacity(10);
	     System.out.println("modified capacity:"+geyser.getCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser model no before modifying:"+geyser.modelNumber);
	     geyser.setModelNumber(4373);
	     System.out.println("modified model no:"+geyser.getModelNumber());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser length before modifying:"+geyser.length);
	     geyser.setLength(38);
	     System.out.println("modified length:"+geyser.getLength());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser width before modifying:"+geyser.width);
	     geyser.setWidth(23);
	     System.out.println("modified width:"+geyser.getWidth());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser weight before modifying:"+geyser.weight);
	     geyser.setWeight(2000);
	     System.out.println("modified weight:"+geyser.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser offers before modifying:"+geyser.offers);
	     geyser.setOffers(false);
	     System.out.println("modified offers:"+geyser.isOffers());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser warranty before modifying:"+geyser.warranty);
	     geyser.setWarranty(2);
	     System.out.println("modified warranty:"+geyser.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing geyser quantity before modifying:"+geyser.quantity);
	     geyser.setQuantity(2);
	     System.out.println("modified quantity:"+geyser.getQuantity());
	     
	}

}
