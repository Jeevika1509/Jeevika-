package com.xworkz.copy.examples;

public class HelmetReadandModify {
	
	public Helmet helmet;

	public void useHelmet(Helmet helmet) {
		 System.out.println("accessing helmet brand before modifying:"+helmet.brand);
		 helmet.setBrand("Steel bird");
	     System.out.println("modified brand:"+helmet.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet color before modifying:"+helmet.color);
	     helmet.setColor("blue");
	     System.out.println("modified color:"+helmet.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet price before modifying:"+helmet.price);
	     helmet.setPrice(1400);
	     System.out.println("modified price:"+helmet.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet weight before modifying:"+helmet.weight);
	     helmet.setWeight(500);
	     System.out.println("modified capacity:"+helmet.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet model no before modifying:"+helmet.modelNo);
	     helmet.setModelNo("A3");
	     System.out.println("modified model no:"+helmet.getModelNo());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet quantity before modifying:"+helmet.quantity);
	     helmet.setQuantity(2);
	     System.out.println("modified quantity:"+helmet.getQuantity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet warranty before modifying:"+helmet.warranty);
	     helmet.setWarranty(2);
	     System.out.println("modified warranty:"+helmet.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet offers before modifying:"+helmet.offers);
	     helmet.setOffers(false);
	     System.out.println("modified offers:"+helmet.isOffers());
	     
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet is ISI Certified  before modifying:"+helmet.ISICertified);
	     helmet.setISICertified(false);
	     System.out.println("modified ISI Certified:"+helmet.isISICertified());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet material before modifying:"+helmet.material);
	     helmet.setMaterial("ABS Material shell");
	     System.out.println("modified material:"+helmet.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing helmet size before modifying:"+helmet.size);
	     helmet.setSize('L');
	     System.out.println("modified size:"+helmet.getSize());
	     
	    
	     
	    
	    
	}
	
}
