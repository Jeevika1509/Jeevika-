package com.xworkz.copy.examples;

public class FridgeReadandModify {

	public Fridge fridge;
	public void useFridge(Fridge fridge) {
		
		System.out.println("fridge brand:"+fridge.getBrand());
	    fridge.setBrand("LG");
	    System.out.println("modified brand:"+fridge.getBrand());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("fridge color:"+fridge.getColor());
	    fridge.setColor("blue");
	    System.out.println("modified color:"+fridge.getColor());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("fridge model no:"+fridge.getModelNumber());
	    fridge.setModelNumber(232);
	    System.out.println("modified model no:"+fridge.getModelNumber());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("fridge length:"+fridge.getLength());
	    fridge.setLength(400);
	    System.out.println("modified fridge length:"+fridge.length);
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("fridge width before modifying:"+fridge.getWidth());
	    fridge.setWidth(66);
	    System.out.println("modified width:"+fridge.getWidth());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("fridge weight:"+fridge.getWeight());
	    fridge.setWeight(58);
	    System.out.println("modified fridge weight:"+fridge.getWeight());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("fridge capacity:"+fridge.getCapacity());
	    fridge.setCapacity(57);
	    System.out.println("modified fridge capacity:"+fridge.getCapacity());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("fridge price:"+fridge.getPrice());
	    fridge.setPrice(28000);
	    System.out.println("modified price:"+fridge.getPrice());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("fridge offers:"+fridge.getOffers());
	    fridge.setOffers("15 %");
	    System.out.println("modified offers:"+fridge.getOffers());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("number of doors in fridge:"+fridge.getNumberOfDoors());
	    fridge.setNumberOfDoors(2);
	    System.out.println("modified number of doors in fridge:"+fridge.getNumberOfDoors());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("warranty for fridge warranty:"+fridge.getWarranty());
	    fridge.setWarranty(2);
	    System.out.println("modified warranty:"+fridge.getWarranty());
		
		
		
		
		
		
		
		
	}
	
}
