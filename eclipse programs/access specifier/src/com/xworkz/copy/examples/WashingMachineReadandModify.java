package com.xworkz.copy.examples;

public class WashingMachineReadandModify {

	public WashingMachine washingmachine;
	
	public void useWashingMachine(WashingMachine washingmachine) {
		 System.out.println("accessing washing machine brand before modifying:"+washingmachine.brand);
		 washingmachine.setBrand("whirlpool");
	     System.out.println("modified brand:"+washingmachine.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine type before modifying:"+washingmachine.type);
	     washingmachine.setType("automatic");
	     System.out.println("modified washing type :"+washingmachine.getType());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine quantity before modifying:"+washingmachine.quantity);
	     washingmachine.setQuantity(2);
	     System.out.println("modified quantity :"+washingmachine.getQuantity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine color before modifying to:"+washingmachine.color);
	     washingmachine.setColor("grey");
	     System.out.println("modified color to:"+washingmachine.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine price before modifying:"+washingmachine.price);
	     washingmachine.setPrice(11000);
	     System.out.println("modified price:"+washingmachine.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine warranty before modifying:"+washingmachine.warranty);
	     washingmachine.setWarranty(2);
	     System.out.println("modified warranty:"+washingmachine.getWarranty());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine working before modifying:"+washingmachine.working);
	     washingmachine.setWorking(false);
	     System.out.println("modified working to:"+washingmachine.isWorking());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine material before modifying:"+washingmachine.material);
	     washingmachine.setMaterial("plastic");
	     System.out.println("modified material:"+washingmachine.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine offers before modifying:"+washingmachine.offers);
	     washingmachine.setOffers(false);
	     System.out.println("modified offers:"+washingmachine.isOffers());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine load capacity before modifying:"+washingmachine.loadCapacity);
	     washingmachine.setLoadCapacity(21);
	     System.out.println("modified load capacity to :"+washingmachine.getLoadCapacity());
	     

	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing washing machine model no before modifying:"+washingmachine.modelNo);
	     washingmachine.setModelNo(57);
	     System.out.println("modified model no:"+washingmachine.getModelNo());
	     
	    

	          
	}
}
