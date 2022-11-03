package com.xworkz.copy.examples;

public class TyreReadandModify {

	public Tyre tyre;
	
	public void useTyre(Tyre tyre) {
		 System.out.println("accessing tyre brand before modifying:"+tyre.brand);
		 tyre.setBrand("Sturdo");
	     System.out.println("modified brand:"+tyre.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre model no before modifying:"+tyre.modelno);
	     tyre.setModelno("Taximax");
	     System.out.println("modified model no:"+tyre.getModelno());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre type before modifying:"+tyre.type);
	     tyre.setType("tubeless");
	     System.out.println("modified tyre type :"+tyre.getType());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre durability  before modifying to:"+tyre.durable);
	     tyre.setDurable(false);
	     System.out.println("modified durability to:"+tyre.isDurable());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre weight before modifying:"+tyre.weight);
	     tyre.setWeight(5);
	     System.out.println("modified weight:"+tyre.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre price before modifying:"+tyre.price);
	     tyre.setPrice(800);
	     System.out.println("modified price:"+tyre.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre quantity before modifying:"+tyre.quantity);
	     tyre.setQuantity(2);
	     System.out.println("modified quantity:"+tyre.getQuantity());
	      
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre load capacity as:"+tyre.loadCapacity);
	     tyre.setLoadCapacity(300);
	     System.out.println("modified load capacity :"+tyre.getLoadCapacity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre length before modifying:"+tyre.length);
	     tyre.setLength(57);
	     System.out.println("modified length:"+tyre.getLength());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre width before modifying:"+tyre.width);
	     tyre.setWidth(57);
	     System.out.println("modified width:"+tyre.getWidth());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre height before modifying:"+tyre.height);
	     tyre.setHeight(57);
	     System.out.println("modified height:"+tyre.getHeight());
	       
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing tyre material before modifying:"+tyre.material);
	     tyre.setMaterial("rubber");
	     System.out.println("modified material to:"+tyre.getMaterial());
	          
	}
}
