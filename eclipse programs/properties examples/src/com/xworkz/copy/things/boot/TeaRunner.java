package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Tea;

public class TeaRunner {
	
	public static void main(String[] args)
	{
		Tea tea=new Tea();
		
		System.out.println(tea.color);
		System.out.println(tea.variety);
		System.out.println(tea.caffeineContent);
		System.out.println(tea.brand);
		System.out.println(tea.price);
		System.out.println(tea.manufacturingDate);
		System.out.println(tea.expiryDate);
		System.out.println(tea.quantity);
		System.out.println(tea.manufacturingUnit);
		tea.barCode=428472;
		tea.flavor="malty";
		tea.quality="good";
		tea.offers=10;
		tea.tasty="yes";
		tea.healthyOrNot=true;
		tea.ingredients="tulsi,elaichi";
		tea.calories=20;
		tea.energyContent=100;
		System.out.println(tea.barCode);
	    System.out.println(tea.flavor);
	    System.out.println(tea.quality);
	    System.out.println(tea.offers);
	    System.out.println(tea.tasty);
	    System.out.println(tea.healthyOrNot);
	    System.out.println(tea.ingredients);
	    System.out.println(tea.calories);
	    System.out.println(tea.energyContent);
	}

}