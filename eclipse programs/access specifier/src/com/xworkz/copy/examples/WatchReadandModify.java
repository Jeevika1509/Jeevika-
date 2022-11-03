package com.xworkz.copy.examples;

public class WatchReadandModify {

	public Watch watch;
	
	public void useWatch(Watch watch) {
		 System.out.println("watch brand:"+watch.getBrand());
		 watch.setBrand("titan");
	     System.out.println("modified brand:"+watch.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("watch model no:"+watch.getModelno());
	     watch.setModelno("90137AP03");
	     System.out.println("modified model no:"+watch.getModelno());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("watch type:"+watch.getType());
	     watch.setType("digital");
	     System.out.println("modified watch type :"+watch.getType());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("watch color  before modifying to:"+watch.getColor());
	     watch.setColor("black");
	     System.out.println("modified color to:"+watch.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("watch price:"+watch.getPrice());
	     watch.setPrice(8000);
	     System.out.println("modified price:"+watch.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("watch warranty:"+watch.getWarranty());
	     watch.setWarranty(2);
	     System.out.println("modified warranty:"+watch.getWarranty());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("watch working:"+watch.isWorking());
	     watch.setWorking(false);
	     System.out.println("modified working to:"+watch.isWorking());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("Is watch water resistant:"+watch.isWaterResistant());
	     watch.setWaterResistant(false);
	     System.out.println("modified water resistant to :"+watch.isWaterResistant());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("watch material:"+watch.getMaterial());
	     watch.setMaterial("alluminium");
	     System.out.println("modified material:"+watch.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("watch weight:"+watch.getWeight());
	     watch.setWeight(57);
	     System.out.println("modified weight:"+watch.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("watch offers:"+watch.isOffers());
	     watch.setOffers(false);
	     System.out.println("modified offers:"+watch.isOffers());

	          
	}
}
