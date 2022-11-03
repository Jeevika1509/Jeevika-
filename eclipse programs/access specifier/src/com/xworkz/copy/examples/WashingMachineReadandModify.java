package com.xworkz.copy.examples;

public class WashingMachineReadandModify {

	public WashingMachine washingmachine;
	
	public void useWashingMachine(WashingMachine washingmachine) {
		 System.out.println("washing machine brand:"+washingmachine.getBrand());
		 washingmachine.setBrand("whirlpool");
	     System.out.println("modified brand:"+washingmachine.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine type:"+washingmachine.getType());
	     washingmachine.setType("automatic");
	     System.out.println("modified washing machine type :"+washingmachine.getType());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine quantity:"+washingmachine.getQuantity());
	     washingmachine.setQuantity(2);
	     System.out.println("modified quantity :"+washingmachine.getQuantity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine color:"+washingmachine.getColor());
	     washingmachine.setColor("grey");
	     System.out.println("modified color to:"+washingmachine.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine price:"+washingmachine.getPrice());
	     washingmachine.setPrice(11000);
	     System.out.println("modified price:"+washingmachine.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine warranty:"+washingmachine.getWarranty());
	     washingmachine.setWarranty(2);
	     System.out.println("modified warranty:"+washingmachine.getWarranty());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine working:"+washingmachine.isWorking());
	     washingmachine.setWorking(false);
	     System.out.println("modified working to:"+washingmachine.isWorking());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine material:"+washingmachine.getMaterial());
	     washingmachine.setMaterial("plastic");
	     System.out.println("modified material:"+washingmachine.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine offers:"+washingmachine.isOffers());
	     washingmachine.setOffers(false);
	     System.out.println("modified offers:"+washingmachine.isOffers());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine load capacity:"+washingmachine.getLoadCapacity());
	     washingmachine.setLoadCapacity(21);
	     System.out.println("modified load capacity to :"+washingmachine.getLoadCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("washing machine model no:"+washingmachine.getModelNo());
	     washingmachine.setModelNo(57);
	     System.out.println("modified model no:"+washingmachine.getModelNo());
	     
	    

	          
	}
}
