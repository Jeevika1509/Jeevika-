package com.xworkz.copy.examples;

public class MicroovenReadandModify {

	public Microoven microoven;
	
	public void useMicrooven(Microoven microoven) {
		System.out.println("accessing microoven brand before modifying:"+microoven.brand);
	     microoven.setBrand("LG");
	     System.out.println("modified brand:"+microoven.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven color before modifying:"+microoven.color);
	     microoven.setColor("black");
	     System.out.println("modified color:"+microoven.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven price before modifying:"+microoven.price);
	     microoven.setPrice(12800);
	     System.out.println("modified price:"+microoven.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven capacity before modifying:"+microoven.capacity);
	     microoven.setCapacity(42);
	     System.out.println("modified capacity:"+microoven.getCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven model no before modifying:"+microoven.modelNumber);
	     microoven.setModelNumber(429);
	     System.out.println("modified model no:"+microoven.getModelNumber());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven length before modifying:"+microoven.length);
	     microoven.setLength(38);
	     System.out.println("modified length:"+microoven.getLength());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven width before modifying:"+microoven.width);
	     microoven.setWidth(38);
	     System.out.println("modified width:"+microoven.getWidth());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven weight before modifying:"+microoven.weight);
	     microoven.setWeight(20);
	     System.out.println("modified weight:"+microoven.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven offers before modifying:"+microoven.offers);
	     microoven.setOffers("20 %");
	     System.out.println("modified offers:"+microoven.getOffers());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven warranty before modifying:"+microoven.warranty);
	     microoven.setWarranty(2);
	     System.out.println("modified warranty:"+microoven.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing microoven quantity before modifying:"+microoven.quantity);
	     microoven.setQuantity(2);
	     System.out.println("modified quantity:"+microoven.getQuantity());
	     
	}
	
}
