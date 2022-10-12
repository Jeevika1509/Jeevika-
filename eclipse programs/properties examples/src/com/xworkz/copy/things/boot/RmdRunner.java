package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Rmd;

public class RmdRunner{
	public static void main(String[] args)
	{
        Rmd rmd=new Rmd();
		
		System.out.println(rmd.color);
		System.out.println(rmd.brand);
		System.out.println(rmd.price);
		System.out.println(rmd.flavor);
		System.out.println(rmd.weight);
		System.out.println(rmd.manufacturingUnit);
		System.out.println(rmd.ingredients);
		System.out.println(rmd.manufacturingDate);
		System.out.println(rmd.expiryDate);
		rmd.licNo=1331700;
		rmd.quantity=1;
		rmd.packagingType="Container";
		rmd.containsElaichi=true;
		rmd.gst=10;
		rmd.offerAvailableOrNot=true;
		rmd.qrCode=true;
		rmd.barCode=4567;
		rmd.containsAntioxidants=true;
		System.out.println(rmd.licNo);
	    System.out.println(rmd.quantity);
	    System.out.println(rmd.packagingType);
	    System.out.println(rmd.containsElaichi);
	    System.out.println(rmd.gst);
	    System.out.println(rmd.offerAvailableOrNot);
	    System.out.println(rmd.qrCode);
	    System.out.println(rmd.barCode);
	    System.out.println(rmd.containsAntioxidants);
	}
}
