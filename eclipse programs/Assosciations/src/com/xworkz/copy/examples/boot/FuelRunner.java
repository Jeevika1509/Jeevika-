package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Fuel;
import com.xworkz.copy.examples.boot.FuelType.Type;

public class FuelRunner {

	public static void main(String[] args) {
		
		Fuel fuel=new Fuel(true,Type.PETROL,110,1);
		fuel.show();
		System.out.println(fuel.totalPrice());
		

	}

}
