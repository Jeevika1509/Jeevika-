package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Helmet;
import com.xworkz.copy.examples.boot.Brand.Brand;



public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet helmet=new Helmet(Brand.GLIDERS,1100,"black","medium",1085);
		
		helmet.display();

	}

}
