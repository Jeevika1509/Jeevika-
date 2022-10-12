package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Cigaratte;

public class CigaratteRunner {
	
	public static void main(String[] args)
	{
		Cigaratte cigaratte=new Cigaratte();
		
		System.out.println(cigaratte.color);
		System.out.println(cigaratte.brand);
		System.out.println(cigaratte.price);
		System.out.println(cigaratte.shape);
		System.out.println(cigaratte.manufacturingDate);
		System.out.println(cigaratte.expiryDate);
		System.out.println(cigaratte.tobaccoContent);
		System.out.println(cigaratte.nicotineContent);
		System.out.println(cigaratte.quantity);
		cigaratte.flavor="herbal mint";
		cigaratte.addictiveOrNot=true;
		cigaratte.origin="India";
		cigaratte.length=4;
		cigaratte.width=3;
		cigaratte.height=9;
		cigaratte.tobaccoFreeOrNot=true;
		cigaratte.nicotineFreeOrNot=true;
		cigaratte.ingredients="tulsi,clove,cinamom";
		System.out.println(cigaratte.flavor);
	    System.out.println(cigaratte.addictiveOrNot);
	    System.out.println(cigaratte.origin);
	    System.out.println(cigaratte.length);
	    System.out.println(cigaratte.width);
	    System.out.println(cigaratte.height);
	    System.out.println(cigaratte.tobaccoFreeOrNot);
	    System.out.println(cigaratte.nicotineFreeOrNot);
	    System.out.println(cigaratte.ingredients);
	}

}