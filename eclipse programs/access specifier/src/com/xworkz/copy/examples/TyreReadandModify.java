package com.xworkz.copy.examples;

public class TyreReadandModify {

	public Tyre tyre;
	
	public void useTyre(Tyre tyre) {
		 System.out.println("tyre brand:"+tyre.getBrand());
		 tyre.setBrand("Sturdo");
	     System.out.println("modified brand:"+tyre.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre model no:"+tyre.getModelno());
	     tyre.setModelno("Taximax");
	     System.out.println("modified model no:"+tyre.getModelno());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre type:"+tyre.getType());
	     tyre.setType("tubeless");
	     System.out.println("modified tyre type :"+tyre.getType());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre durability:"+tyre.isDurable());
	     tyre.setDurable(false);
	     System.out.println("modified durability to:"+tyre.isDurable());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre weight:"+tyre.getWeight());
	     tyre.setWeight(5);
	     System.out.println("modified weight:"+tyre.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre price:"+tyre.getPrice());
	     tyre.setPrice(800);
	     System.out.println("modified price:"+tyre.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre quantity:"+tyre.getQuantity());
	     tyre.setQuantity(2);
	     System.out.println("modified quantity:"+tyre.getQuantity());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre load capacity:"+tyre.getLoadCapacity());
	     tyre.setLoadCapacity(300);
	     System.out.println("modified load capacity :"+tyre.getLoadCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre length:"+tyre.getLength());
	     tyre.setLength(57);
	     System.out.println("modified length:"+tyre.getLength());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre width:"+tyre.getWidth());
	     tyre.setWidth(57);
	     System.out.println("modified width:"+tyre.getWidth());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre height:"+tyre.getHeight());
	     tyre.setHeight(57);
	     System.out.println("modified height:"+tyre.getHeight());
	       
	     System.out.println(System.lineSeparator());
	     System.out.println("tyre material:"+tyre.getMaterial());
	     tyre.setMaterial("rubber");
	     System.out.println("modified material to:"+tyre.getMaterial());
	          
	}
}
