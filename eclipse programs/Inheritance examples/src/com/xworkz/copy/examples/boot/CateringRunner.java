package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Catering;
import com.xworkz.copy.examples.WeddingCatering;

public class CateringRunner {

	public static void main(String[] args) {
		Catering catering=new WeddingCatering("jayanagar", 50, 20000);
		System.out.println(catering.venue);
		System.out.println(catering.noOfPeople);
		System.out.println(catering.price);
		

	}

}
