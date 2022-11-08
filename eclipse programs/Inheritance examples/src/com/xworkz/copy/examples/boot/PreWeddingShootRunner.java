package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Outdoor;
import com.xworkz.copy.examples.PreWeddingShoot;

public class PreWeddingShootRunner {

	public static void main(String[] args) {
		
		PreWeddingShoot preweddingshoot=new Outdoor(true, "jayanagar", 7);
		System.out.println(preweddingshoot.booking);
		System.out.println(preweddingshoot.place);
		System.out.println(preweddingshoot.timings);

	}

}
