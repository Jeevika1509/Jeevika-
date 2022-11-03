package com.xworkz.copy.examples;

public class WatchReadandModify {

	public Watch watch;
	
	public void useWatch(Watch watch) {
		 System.out.println("accessing watch brand before modifying:"+watch.brand);
		 watch.setBrand("titan");
	     System.out.println("modified brand:"+watch.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch model no before modifying:"+watch.modelno);
	     watch.setModelno("90137AP03");
	     System.out.println("modified model no:"+watch.getModelno());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch type before modifying:"+watch.type);
	     watch.setType("digital");
	     System.out.println("modified watch type :"+watch.getType());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch color  before modifying to:"+watch.color);
	     watch.setColor("black");
	     System.out.println("modified color to:"+watch.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch price before modifying:"+watch.price);
	     watch.setPrice(8000);
	     System.out.println("modified price:"+watch.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch warranty before modifying:"+watch.warranty);
	     watch.setWarranty(2);
	     System.out.println("modified warranty:"+watch.getWarranty());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch working before modifying:"+watch.working);
	     watch.setWorking(false);
	     System.out.println("modified working to:"+watch.isWorking());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch water resistant before modifying:"+watch.waterResistant);
	     watch.setWaterResistant(false);
	     System.out.println("modified water resistant to :"+watch.isWaterResistant());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch material before modifying:"+watch.material);
	     watch.setMaterial("alluminium");
	     System.out.println("modified material:"+watch.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch weight before modifying:"+watch.weight);
	     watch.setWeight(57);
	     System.out.println("modified weight:"+watch.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing watch offers before modifying:"+watch.offers);
	     watch.setOffers(false);
	     System.out.println("modified offers:"+watch.isOffers());

	          
	}
}
