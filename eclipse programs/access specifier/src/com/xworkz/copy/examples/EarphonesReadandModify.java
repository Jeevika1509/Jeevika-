package com.xworkz.copy.examples;

public class EarphonesReadandModify {
	
	public Earphones earphones;

	
	public void useEarphones(Earphones earphones) {
		System.out.println("accessing earphones brand before modifying:"+earphones.brand);
	     earphones.setBrand("jbl");
	     System.out.println("modified brand:"+earphones.getBrand());
	     
	     System.out.println("accessing earphones color before modifying:"+earphones.color);
	     earphones.setColor("blue");
	     System.out.println("modified color:"+earphones.getColor());
	     
	     System.out.println("accessing earphones price before modifying:"+earphones.price);
	     earphones.setPrice(350);
	     System.out.println("modified price:"+earphones.getPrice());
	     
	     System.out.println("accessing earphones connector type before modifying:"+earphones.conectorType);
	     earphones.setConectorType("wireless");
	     System.out.println("modified connector type:"+earphones.getConectorType());
	     
	     System.out.println("accessing earphones model no before modifying:"+earphones.modelNo);
	     earphones.setModelNo(4373);
	     System.out.println("modified model no:"+earphones.getModelNo());
	     
	     System.out.println("accessing earphones quantity before modifying:"+earphones.quantity);
	     earphones.setQuantity(2);
	     System.out.println("modified quantity:"+earphones.getQuantity());
	     
	     System.out.println("accessing earphones weight before modifying:"+earphones.weight);
	     earphones.setWeight(133);
	     System.out.println("modified weight:"+earphones.getWeight());
	     
	     System.out.println("accessing earphones warranty before modifying:"+earphones.warranty);
	     earphones.setWarranty(2);
	     System.out.println("modified warranty:"+earphones.getWarranty());
	     
	     System.out.println("accessing earphones offers before modifying:"+earphones.offers);
	     earphones.setOffers("10 %");
	     System.out.println("modified offers:"+earphones.getOffers());
	     
	     System.out.println("accessing earphones are working before modifying:"+earphones.working);
	     earphones.setWorking(false);
	     System.out.println("modified working:"+earphones.isWorking());
	     
	     System.out.println("accessing earphones material before modifying:"+earphones.material);
	     earphones.setMaterial("fiber");
	     System.out.println("modified material:"+earphones.getMaterial());
	     
	     
	     
	     
			
	}
	
	
}
