package com.xworkz.copy.examples;

public class EarphonesReadandModify {
	
	public Earphones earphones;

	
	public void useEarphones(Earphones earphones) {
		System.out.println("earphones brand:"+earphones.getBrand());
	     earphones.setBrand("jbl");
	     System.out.println("modified brand:"+earphones.getBrand());
	     
	     System.out.println("earphones color:"+earphones.getColor());
	     earphones.setColor("blue");
	     System.out.println("modified color:"+earphones.getColor());
	     
	     System.out.println("earphones price:"+earphones.getPrice());
	     earphones.setPrice(350);
	     System.out.println("modified price:"+earphones.getPrice());
	     
	     System.out.println("earphones connector type:"+earphones.getConectorType());
	     earphones.setConectorType("wireless");
	     System.out.println("modified connector type:"+earphones.getConectorType());
	     
	     System.out.println("earphones model no:"+earphones.getModelNo());
	     earphones.setModelNo(4373);
	     System.out.println("modified model no:"+earphones.getModelNo());
	     
	     System.out.println("earphones quantity:"+earphones.getQuantity());
	     earphones.setQuantity(2);
	     System.out.println("modified quantity:"+earphones.getQuantity());
	     
	     System.out.println("earphones weight:"+earphones.getWeight());
	     earphones.setWeight(133);
	     System.out.println("modified weight:"+earphones.getWeight());
	     
	     System.out.println("earphones warranty:"+earphones.getWarranty());
	     earphones.setWarranty(2);
	     System.out.println("modified warranty:"+earphones.getWarranty());
	     
	     System.out.println("earphones offers :"+earphones.getOffers());
	     earphones.setOffers("10 %");
	     System.out.println("modified offers:"+earphones.getOffers());
	     
	     System.out.println("earphones are working:"+earphones.isWorking());
	     earphones.setWorking(false);
	     System.out.println("modified working:"+earphones.isWorking());
	     
	     System.out.println("earphones material:"+earphones.getMaterial());
	     earphones.setMaterial("fiber");
	     System.out.println("modified material:"+earphones.getMaterial());
	     
	     
	     
	     
			
	}
	
	
}
