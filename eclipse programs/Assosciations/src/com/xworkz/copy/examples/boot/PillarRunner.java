package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Pillar;
import com.xworkz.copy.examples.boot.Shape.Shape;

public class PillarRunner {

	public static void main(String[] args) {
		
		Pillar pillar=new Pillar(4863,"Bangalore",Shape.CIRCULAR,35.5,"steel");
		pillar.show();

	}

}
