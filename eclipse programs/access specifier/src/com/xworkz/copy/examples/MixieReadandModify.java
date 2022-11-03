package com.xworkz.copy.examples;

public class MixieReadandModify {

	public Mixie mixie;
	
	public void useMixie(Mixie mixie) {
		System.out.println("accessing mixie brand before modifying:"+mixie.brand);
	     mixie.setBrand("prestige");
	     System.out.println("modified brand:"+mixie.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie color before modifying:"+mixie.color);
	     mixie.setColor("black");
	     System.out.println("modified color:"+mixie.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie price before modifying:"+mixie.price);
	     mixie.setPrice(3600);
	     System.out.println("modified price:"+mixie.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie capacity before modifying:"+mixie.capacity);
	     mixie.setCapacity(1.5);
	     System.out.println("modified capacity:"+mixie.getCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie model no before modifying:"+mixie.modelNumber);
	     mixie.setModelNumber(544);
	     System.out.println("modified model no:"+mixie.getModelNumber());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie length before modifying:"+mixie.length);
	     mixie.setLength(20);
	     System.out.println("modified length:"+mixie.getLength());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie width before modifying:"+mixie.width);
	     mixie.setWidth(38);
	     System.out.println("modified width:"+mixie.getWidth());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie speed before modifying:"+mixie.speed);
	     mixie.setSpeed(17000);
	     System.out.println("modified speed:"+mixie.getSpeed());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie is working before modifying:"+mixie.working);
	     mixie.setWorking(false);
	     System.out.println("modified working to:"+mixie.isWorking());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie warranty before modifying:"+mixie.warranty);
	     mixie.setWarranty(2);
	     System.out.println("modified warranty:"+mixie.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing mixie material before modifying:"+mixie.material);
	     mixie.setMaterial("plastic");
	     System.out.println("modified quantity:"+mixie.getMaterial());
	}
}
