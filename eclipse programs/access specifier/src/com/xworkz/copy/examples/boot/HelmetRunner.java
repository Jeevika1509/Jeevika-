package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Helmet;
import com.xworkz.copy.examples.HelmetReadandModify;

public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet helmet=new Helmet();
		HelmetReadandModify modify=new HelmetReadandModify();
		modify.useHelmet(helmet);

	}

}
