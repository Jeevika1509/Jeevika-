package com.xworkz.copy.examples;

public class TrimmerReadandModify {

	public Trimmer trimmer;
	
	public void useTrimmer(Trimmer trimmer) {
		 System.out.println("trimmer brand:"+trimmer.getBrand());
	     trimmer.setBrand("nova");
	     System.out.println("modified brand:"+trimmer.getBrand());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer color:"+trimmer.getColor());
	     trimmer.setColor("grey");
	     System.out.println("modified color:"+trimmer.getColor());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer price:"+trimmer.getPrice());
	     trimmer.setPrice(800);
	     System.out.println("modified price:"+trimmer.getPrice());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer working as:"+trimmer.isWorking());
	     trimmer.setWorking(false);
	     System.out.println("modified working to:"+trimmer.isWorking());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer warranty:"+trimmer.getWarranty());
	     trimmer.setWarranty(2);
	     System.out.println("modified warranty :"+trimmer.getWarranty());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer quantity:"+trimmer.getQuantity());
	     trimmer.setQuantity(2);
	     System.out.println("modified quantity:"+trimmer.getQuantity());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer type:"+trimmer.getType());
	     trimmer.setType("beard trimmer");
	     System.out.println("modified trimmer type :"+trimmer.getType());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer weight:"+trimmer.getWeight());
	     trimmer.setWeight(200);
	     System.out.println("modified weight :"+trimmer.getWeight());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer material:"+trimmer.getMaterial());
	     trimmer.setMaterial("stainless steel");
	     System.out.println("modified material to:"+trimmer.getMaterial());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer model no :"+trimmer.getModelno());
	     trimmer.setModelno("m359");
	     System.out.println("modified model no:"+trimmer.getModelno());
	     
	     System.out.println(System.lineSeparator());
	     System.out.println("trimmer length:"+trimmer.getLength());
	     trimmer.setLength(15);
	     System.out.println("modified length:"+trimmer.getLength());
	}

}
