package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Dowry;
import com.xworkz.copy.examples.Property;

public class DowryRunner {

	public static void main(String[] args) {
		
		Dowry dowry=new Property(30000,true,true);
		System.out.println(dowry.cash);
		System.out.println(dowry.gold);
		System.out.println(dowry.illegal);
		
		

	}

}
