package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Geyser;
import com.xworkz.copy.examples.GeyserReadandModify;

public class GeyserRunner {

	public static void main(String[] args) {
		
		Geyser geyser=new Geyser();
		GeyserReadandModify modify=new GeyserReadandModify();
		modify.useGeyser(geyser);

	}

}
