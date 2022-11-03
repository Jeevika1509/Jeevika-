package com.xworkz.copy.examples;

public class BagReadandModify {
	public Bag bag;
	public void useBag(Bag bag) {
		System.out.println("accessing bag brand before modifying:"+bag.brand);
	     bag.setBrand("hp");
	     System.out.println("modified brand:"+bag.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing bag color before modifying:"+bag.color);
	     bag.setColor("black");
	     System.out.println("modified color:"+bag.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing bag price before modifying:"+bag.price);
	     bag.setPrice(1000);
	     System.out.println("modified price:"+bag.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accesing bag warranty before modifying:"+bag.warranty);
	     bag.setWarranty(2);
	     System.out.println("modified warranty:"+bag.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accesing bag adjustale or not before modifying:"+bag.adjustable);
	     bag.setAdjustable(false);
	     System.out.println("modified bag adjustable or not to:"+bag.isAdjustable());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accesing bag which is laptop comptabile or not before modifying:"+bag.laptopCompatible);
	     bag.setLaptopCompatible(true);
	     System.out.println("modified bag laptop compatibility to:"+bag.isLaptopCompatible());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accesing bag material before modifying:"+bag.material);
	     bag.setMaterial("leather");
	     System.out.println("modified bag material:"+bag.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accesing bag waterResistant property before modifying:"+bag.waterResistant);
	     bag.setWaterResistant(true);
	     System.out.println("modified bag water resistant or not to:"+bag.isWaterResistant());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accesing bag capacity before modifying:"+bag.capacity);
	     bag.setCapacity(35);
	     System.out.println("modified brand:"+bag.getCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accesing bag offers before modifying:"+bag.offers);
	     bag.setBrand("10 %");
	     System.out.println("modified offers :"+bag.getOffers());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accesing bag quantity before modifying:"+bag.quantity);
	     bag.setQuantity(2);
	     System.out.println("modified quantity:"+bag.getQuantity());
	     
}
}
