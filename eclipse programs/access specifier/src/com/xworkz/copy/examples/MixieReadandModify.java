package com.xworkz.copy.examples;

public class MixieReadandModify {

	public Mixie mixie;
	
	public void useMixie(Mixie mixie) {
		System.out.println("mixie brand:"+mixie.getBrand());
	     mixie.setBrand("prestige");
	     System.out.println("modified brand:"+mixie.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("mixie color:"+mixie.getColor());
	     mixie.setColor("black");
	     System.out.println("modified color:"+mixie.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("mixie price:"+mixie.getPrice());
	     mixie.setPrice(3600);
	     System.out.println("modified price:"+mixie.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("mixie capacity:"+mixie.getCapacity());
	     mixie.setCapacity(1.5);
	     System.out.println("modified capacity:"+mixie.getCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("mixie model no:"+mixie.getModelNumber());
	     mixie.setModelNumber(544);
	     System.out.println("modified model no:"+mixie.getModelNumber());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("mixie length:"+mixie.getLength());
	     mixie.setLength(20);
	     System.out.println("modified length:"+mixie.getLength());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("mixie width:"+mixie.getWidth());
	     mixie.setWidth(38);
	     System.out.println("modified width:"+mixie.getWidth());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println(" mixie speed:"+mixie.getSpeed());
	     mixie.setSpeed(17000);
	     System.out.println("modified speed:"+mixie.getSpeed());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("is mixie working:"+mixie.isWorking());
	     mixie.setWorking(false);
	     System.out.println("modified working to:"+mixie.isWorking());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("mixie warranty:"+mixie.getWarranty());
	     mixie.setWarranty(2);
	     System.out.println("modified warranty:"+mixie.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("mixie material:"+mixie.getMaterial());
	     mixie.setMaterial("plastic");
	     System.out.println("modified material:"+mixie.getMaterial());
	}
}
