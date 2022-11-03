package com.xworkz.copy.examples;

public class TrimmerReadandModify {

	public Trimmer trimmer;
	
	public void useTrimmer(Trimmer trimmer) {
		 System.out.println("accessing trimmer brand before modifying:"+trimmer.brand);
	     trimmer.setBrand("nova");
	     System.out.println("modified brand:"+trimmer.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer color before modifying:"+trimmer.color);
	     trimmer.setColor("grey");
	     System.out.println("modified color:"+trimmer.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer price before modifying:"+trimmer.price);
	     trimmer.setPrice(800);
	     System.out.println("modified price:"+trimmer.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer working as:"+trimmer.working);
	     trimmer.setWorking(false);
	     System.out.println("modified working to:"+trimmer.isWorking());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer warranty before modifying:"+trimmer.warranty);
	     trimmer.setWarranty(2);
	     System.out.println("modified warranty :"+trimmer.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer quantity before modifying:"+trimmer.quantity);
	     trimmer.setQuantity(2);
	     System.out.println("modified quantity:"+trimmer.getQuantity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer type before modifying:"+trimmer.type);
	     trimmer.setType("beard trimmer");
	     System.out.println("modified trimmer type :"+trimmer.getType());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer weight before modifying:"+trimmer.weight);
	     trimmer.setWeight(200);
	     System.out.println("modified weight :"+trimmer.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer material before modifying:"+trimmer.material);
	     trimmer.setMaterial("stainless steel");
	     System.out.println("modified material to:"+trimmer.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer model no before modifying:"+trimmer.modelno);
	     trimmer.setModelno("m359");
	     System.out.println("modified model no:"+trimmer.getModelno());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("accessing trimmer length before modifying:"+trimmer.length);
	     trimmer.setLength(15);
	     System.out.println("modified length:"+trimmer.getLength());
	}

}
