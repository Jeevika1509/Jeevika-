package com.xworkz.copy.examples;

public class HelmetReadandModify {
	
	public Helmet helmet;

	public void useHelmet(Helmet helmet) {
		 System.out.println("helmet brand:"+helmet.getBrand());
		 helmet.setBrand("Steel bird");
	     System.out.println("modified brand:"+helmet.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet color:"+helmet.getColor());
	     helmet.setColor("blue");
	     System.out.println("modified color:"+helmet.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet price:"+helmet.getPrice());
	     helmet.setPrice(1400);
	     System.out.println("modified price:"+helmet.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet weight:"+helmet.getWeight());
	     helmet.setWeight(500);
	     System.out.println("modified weight:"+helmet.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet model no :"+helmet.getModelNo());
	     helmet.setModelNo("A3");
	     System.out.println("modified model no:"+helmet.getModelNo());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet quantity:"+helmet.getQuantity());
	     helmet.setQuantity(2);
	     System.out.println("modified quantity:"+helmet.getQuantity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet warranty:"+helmet.getWarranty());
	     helmet.setWarranty(2);
	     System.out.println("modified warranty:"+helmet.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet offers:"+helmet.isOffers());
	     helmet.setOffers(false);
	     System.out.println("modified offers:"+helmet.isOffers());
	     
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet is ISI Certified:"+helmet.isISICertified());
	     helmet.setISICertified(false);
	     System.out.println("modified ISI Certified:"+helmet.isISICertified());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet material:"+helmet.getMaterial());
	     helmet.setMaterial("ABS Material shell");
	     System.out.println("modified material:"+helmet.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("helmet siz:"+helmet.getSize());
	     helmet.setSize('L');
	     System.out.println("modified size:"+helmet.getSize());
	     
	    
	     
	    
	    
	}
	
}
