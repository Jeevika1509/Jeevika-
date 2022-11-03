package com.xworkz.copy.examples;

public class BagReadandModify {
	public Bag bag;
	public void useBag(Bag bag) {
		System.out.println("brand:"+bag.getBrand());
	     bag.setBrand("hp");
	     System.out.println("modified brand:"+bag.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("bag color:"+bag.getColor());
	     bag.setColor("black");
	     System.out.println("modified color:"+bag.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println(" bag price:"+bag.getPrice());
	     bag.setPrice(1000);
	     System.out.println("modified price:"+bag.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("bag warranty :"+bag.getWarranty());
	     bag.setWarranty(2);
	     System.out.println("modified warranty:"+bag.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println(" bag adjustale :"+bag.isAdjustable());
	     bag.setAdjustable(false);
	     System.out.println("modified bag adjustable to:"+bag.isAdjustable());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("is bag laptop comptabile :"+bag.isLaptopCompatible());
	     bag.setLaptopCompatible(true);
	     System.out.println("modified bag laptop compatibility to:"+bag.isLaptopCompatible());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("bag material :"+bag.getMaterial());
	     bag.setMaterial("leather");
	     System.out.println("modified bag material:"+bag.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("is bag waterResistant :"+bag.isWaterResistant());
	     bag.setWaterResistant(true);
	     System.out.println("modified bag water resistant to:"+bag.isWaterResistant());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("bag capacity :"+bag.getCapacity());
	     bag.setCapacity(35);
	     System.out.println("modified bag capacity:"+bag.getCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("offers for bag:"+bag.getOffers());
	     bag.setBrand("10 %");
	     System.out.println("modified offers :"+bag.getOffers());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("bag quantity:"+bag.getQuantity());
	     bag.setQuantity(2);
	     System.out.println("modified quantity:"+bag.getQuantity());
	     
}
}
