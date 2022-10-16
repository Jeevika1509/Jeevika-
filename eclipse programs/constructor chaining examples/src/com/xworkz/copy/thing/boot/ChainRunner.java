package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.Chain;

public class ChainRunner {

	public static void main(String[] args) {
		
		Chain chain=new Chain();
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);
		System.out.println(chain.weight);
		System.out.println(chain.stolen);
		System.out.println(chain.usedFor);
		System.out.println(chain.fresh);
		
		chain=new Chain("link chain");
		System.out.println("chain type:"+chain.type);
		
		chain=new Chain("cord chain",31000);
		System.out.println("chain type:"+chain.type);
		System.out.println("chain price:"+chain.price);
		
		chain=new Chain("silver chain",1400,24);
		System.out.println("chain type:"+chain.type);
		System.out.println("chain price:"+chain.price);
		System.out.println("chain length:"+chain.length);
		
		chain=new Chain("Sterling silver",1700,18,"precious metal");
		System.out.println("chain type:"+chain.type);
		System.out.println("chain price:"+chain.price);
		System.out.println("chain length:"+chain.length);
		System.out.println("chain material:"+chain.material);
		
		chain=new Chain("Square pendant",3600,18,"Gold",14);
		System.out.println("chain type:"+chain.type);
		System.out.println("chain price:"+chain.price);
		System.out.println("chain length:"+chain.length);
		System.out.println("chain material:"+chain.material);
		System.out.println("chain weight:"+chain.weight);
		
		chain=new Chain("Box chain", 2000, 10,"sterling silver", 75, false);
		System.out.println("chain type:"+chain.type);
		System.out.println("chain price:"+chain.price);
		System.out.println("chain length:"+chain.length);
		System.out.println("chain material:"+chain.material);
		System.out.println("chain weight:"+chain.weight);
		System.out.println("is chain stolen :"+chain.stolen);
		
		chain=new Chain("bead chain",255,6,"acrylic", 18, false, "bracelets");
		System.out.println("chain type:"+chain.type);
		System.out.println("chain price:"+chain.price);
		System.out.println("chain length:"+chain.length);
		System.out.println("chain material:"+chain.material);
		System.out.println("chain weight:"+chain.weight);
		System.out.println("is chain stolen:"+chain.stolen);
		System.out.println("chain is used for:"+chain.usedFor);
		
		chain=new Chain("cable chain",1194,15,"sterling silver",250,false,"jewelry chain","yes");
		System.out.println("chain type:"+chain.type);
		System.out.println("chain price:"+chain.price);
		System.out.println("chain length:"+chain.length);
		System.out.println("chain material:"+chain.material);
		System.out.println("chain weight:"+chain.weight);
		System.out.println("is chain stolen:"+chain.stolen);
		System.out.println("chain used for:"+chain.usedFor);
		System.out.println("is chain fresh:"+chain.fresh);
		
		
		
		

	}

}
