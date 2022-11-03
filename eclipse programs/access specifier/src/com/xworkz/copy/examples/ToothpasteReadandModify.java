package com.xworkz.copy.examples;

public class ToothpasteReadandModify {

	public Toothpaste toothpaste;
	
	public void useToothpaste(Toothpaste toothpaste) {
		System.out.println("accessing toothpaste brand before modifying:"+toothpaste.brand);
	     toothpaste.setBrand("meswak");
	     System.out.println("modified brand:"+toothpaste.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste color before modifying:"+toothpaste.color);
	     toothpaste.setColor("white");
	     System.out.println("modified color:"+toothpaste.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste price before modifying:"+toothpaste.price);
	     toothpaste.setPrice(360);
	     System.out.println("modified price:"+toothpaste.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste flavour before modifying:"+toothpaste.flavour);
	     toothpaste.setFlavour("ayurvedic");
	     System.out.println("modified flavour:"+toothpaste.getFlavour());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste weight before modifying:"+toothpaste.weight);
	     toothpaste.setWeight(200);
	     System.out.println("modified weight :"+toothpaste.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste barcode before modifying:"+toothpaste.barcode);
	     toothpaste.setBarcode(20456);
	     System.out.println("modified barcode:"+toothpaste.getBarcode());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste manufacturing date before modifying:"+toothpaste.manufacturingDate);
	     toothpaste.setManufacturingDate("25 Nov 2022");
	     System.out.println("modified manufacturing date:"+toothpaste.getManufacturingDate());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste expiry date before modifying:"+toothpaste.expiryDate);
	     toothpaste.setExpiryDate("25 nov 2024");
	     System.out.println("modified expiry date:"+toothpaste.getExpiryDate());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste offers before modifying:"+toothpaste.offers);
	     toothpaste.setOffers("15 %");
	     System.out.println("modified offers to:"+toothpaste.getOffers());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste warranty before modifying:"+toothpaste.warranty);
	     toothpaste.setWarranty(3);
	     System.out.println("modified warranty:"+toothpaste.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing toothpaste quantity before modifying:"+toothpaste.quantity);
	     toothpaste.setQuantity(2);
	     System.out.println("modified quantity:"+toothpaste.getQuantity());
	}

}
