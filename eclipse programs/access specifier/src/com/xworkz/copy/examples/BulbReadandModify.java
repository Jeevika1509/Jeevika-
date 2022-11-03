package com.xworkz.copy.examples;

public class BulbReadandModify {

	public Bulb bulb;
	public void useBulb(Bulb bulb) {
		System.out.println("accessing bulb brand before modifying:"+bulb.brand);
	    bulb.setBrand("phillips");
	    System.out.println("modified brand:"+bulb.getBrand());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb color before modifying:"+bulb.color);
	    bulb.setColor("bright white");
	    System.out.println("modified color:"+bulb.getColor());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb model no before modifying:"+bulb.modelno);
	    bulb.setModelno("D33");
	    System.out.println("modified model no:"+bulb.getModelno());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb type before modifying:"+bulb.type);
	    bulb.setType("halogen");
	    System.out.println("modified bulb type:"+bulb.getType());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb price before modifying:"+bulb.price);
	    bulb.setPrice(350);
	    System.out.println("modified price:"+bulb.getPrice());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb warranty before modifying:"+bulb.warranty);
	    bulb.setWarranty(2);
	    System.out.println("modified warranty:"+bulb.getWarranty());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb working or not before modifying:"+bulb.working);
	    bulb.setWorking(false);
	    System.out.println("modified bulb working to:"+bulb.isWorking());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb quantity before modifying:"+bulb.quantity);
	    bulb.setQuantity(2);
	    System.out.println("modified quantity:"+bulb.getQuantity());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb weight before modifying:"+bulb.weight);
	    bulb.setWeight(130);
	    System.out.println("modified weight:"+bulb.getWeight());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb material before modifying:"+bulb.material);
	    bulb.setMaterial("plastic");
	    System.out.println("modified material:"+bulb.getMaterial());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing bulb offers before modifying:"+bulb.offers);
	    bulb.setOffers(false);
	    System.out.println("modified offers:"+bulb.isOffers());
	     
	
	
}
}
