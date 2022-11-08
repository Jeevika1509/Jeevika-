package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.DJ;
import com.xworkz.copy.examples.WeddingDJ;

public class DJRunner {

	public static void main(String[] args) {
		
		DJ dj=new WeddingDJ(10, 50, "Indiranagar");
		System.out.println(dj.time);
		System.out.println(dj.songs);
		System.out.println(dj.place);
		
		

	}

}
