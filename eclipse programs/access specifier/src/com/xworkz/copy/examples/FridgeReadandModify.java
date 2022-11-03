package com.xworkz.copy.examples;

public class FridgeReadandModify {

	public Fridge fridge;
	public void useFridge(Fridge fridge) {
		
		System.out.println("accessing fridge brand before modifying:"+fridge.brand);
	    fridge.setBrand("LG");
	    System.out.println("modified brand:"+fridge.getBrand());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge color before modifying:"+fridge.color);
	    fridge.setColor("blue");
	    System.out.println("modified color:"+fridge.getColor());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge model no before modifying:"+fridge.modelNumber);
	    fridge.setModelNumber(232);
	    System.out.println("modified model no:"+fridge.getModelNumber());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge length before modifying:"+fridge.length);
	    fridge.setLength(400);
	    System.out.println("modified fridge length:"+fridge.length);
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge width before modifying:"+fridge.width);
	    fridge.setWidth(66);
	    System.out.println("modified width:"+fridge.getWidth());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge weight before modifying:"+fridge.weight);
	    fridge.setWeight(58);
	    System.out.println("modified fridge weight:"+fridge.getWeight());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge capacity before modifying:"+fridge.capacity);
	    fridge.setCapacity(57);
	    System.out.println("modified fridge capacity:"+fridge.getCapacity());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge price before modifying:"+fridge.price);
	    fridge.setPrice(28000);
	    System.out.println("modified price:"+fridge.getPrice());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge offers before modifying:"+fridge.offers);
	    fridge.setOffers("15 %");
	    System.out.println("modified offers:"+fridge.getOffers());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing number of doors in fridge before modifying:"+fridge.numberOfDoors);
	    fridge.setNumberOfDoors(2);
	    System.out.println("modified offers:"+fridge.getNumberOfDoors());
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("accessing fridge warranty before modifying:"+fridge.warranty);
	    fridge.setWarranty(2);
	    System.out.println("modified warranty:"+fridge.getWarranty());
		
		
		
		
		
		
		
		
	}
	
}
