package com.xworkz.copy.examples;

public class BulbReadandModify {

	public Bulb bulb;
	public void useBulb(Bulb bulb) {
		System.out.println("bulb brand: "+bulb.getBrand());
	    bulb.setBrand("phillips");
	    System.out.println("modified brand:"+bulb.getBrand());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("bulb color:"+bulb.getColor());
	    bulb.setColor("bright white");
	    System.out.println("modified color:"+bulb.getColor());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("bulb model no:"+bulb.getModelno());
	    bulb.setModelno("D33");
	    System.out.println("modified model no:"+bulb.getModelno());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("bulb type :"+bulb.getType());
	    bulb.setType("halogen");
	    System.out.println("modified bulb type:"+bulb.getType());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("bulb price:"+bulb.getPrice());
	    bulb.setPrice(350);
	    System.out.println("modified price:"+bulb.getPrice());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("warranty for bulb :"+bulb.getWarranty());
	    bulb.setWarranty(2);
	    System.out.println("modified warranty:"+bulb.getWarranty());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("is bulb working :"+bulb.isWorking());
	    bulb.setWorking(false);
	    System.out.println("modified bulb working to:"+bulb.isWorking());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("bulb quantity:"+bulb.getQuantity());
	    bulb.setQuantity(2);
	    System.out.println("modified quantity:"+bulb.getQuantity());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("bulb weight:"+bulb.getWeight());
	    bulb.setWeight(130);
	    System.out.println("modified weight:"+bulb.getWeight());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("bulb material:"+bulb.getMaterial());
	    bulb.setMaterial("plastic");
	    System.out.println("modified material:"+bulb.getMaterial());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("bulb offers:"+bulb.isOffers());
	    bulb.setOffers(false);
	    System.out.println("modified offers:"+bulb.isOffers());
	     
	
	
}
}
