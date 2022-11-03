package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Fridge;
import com.xworkz.copy.examples.FridgeReadandModify;

public class FridgeRunner {

	public static void main(String[] args) {
		
		Fridge fridge=new Fridge();
		FridgeReadandModify modify=new FridgeReadandModify();
		modify.useFridge(fridge);

	}

}
