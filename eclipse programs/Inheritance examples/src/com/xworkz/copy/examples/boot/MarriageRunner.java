package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.ArrangeMarriage;
import com.xworkz.copy.examples.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {
		
		Marriage marriage=new ArrangeMarriage("RR NAGAR", false, 10);
		System.out.println(marriage.place);
		System.out.println(marriage.grand);
		System.out.println(marriage.time);
	}

}
