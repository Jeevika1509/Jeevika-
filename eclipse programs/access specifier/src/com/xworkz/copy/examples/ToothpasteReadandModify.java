package com.xworkz.copy.examples;

public class ToothpasteReadandModify {

	public Toothpaste toothpaste;
	
	public void useToothpaste(Toothpaste toothpaste) {
		System.out.println("toothpaste brand:"+toothpaste.getBrand());
	     toothpaste.setBrand("meswak");
	     System.out.println("modified brand:"+toothpaste.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste color:"+toothpaste.getColor());
	     toothpaste.setColor("white");
	     System.out.println("modified color:"+toothpaste.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste price:"+toothpaste.getPrice());
	     toothpaste.setPrice(360);
	     System.out.println("modified price:"+toothpaste.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste flavour:"+toothpaste.getFlavour());
	     toothpaste.setFlavour("ayurvedic");
	     System.out.println("modified flavour:"+toothpaste.getFlavour());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste weight:"+toothpaste.getWeight());
	     toothpaste.setWeight(200);
	     System.out.println("modified weight :"+toothpaste.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste barcode:"+toothpaste.getBarcode());
	     toothpaste.setBarcode(20456);
	     System.out.println("modified barcode:"+toothpaste.getBarcode());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste manufacturing date:"+toothpaste.getManufacturingDate());
	     toothpaste.setManufacturingDate("25 Nov 2022");
	     System.out.println("modified manufacturing date:"+toothpaste.getManufacturingDate());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste expiry date:"+toothpaste.getExpiryDate());
	     toothpaste.setExpiryDate("25 nov 2024");
	     System.out.println("modified expiry date:"+toothpaste.getExpiryDate());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste offers:"+toothpaste.getOffers());
	     toothpaste.setOffers("15 %");
	     System.out.println("modified offers to:"+toothpaste.getOffers());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste warranty :"+toothpaste.getWarranty());
	     toothpaste.setWarranty(3);
	     System.out.println("modified warranty:"+toothpaste.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("toothpaste quantity:"+toothpaste.getQuantity());
	     toothpaste.setQuantity(2);
	     System.out.println("modified quantity:"+toothpaste.getQuantity());
	}

}
