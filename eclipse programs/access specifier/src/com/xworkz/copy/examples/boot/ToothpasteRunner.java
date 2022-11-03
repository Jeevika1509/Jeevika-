package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Toothpaste;
import com.xworkz.copy.examples.ToothpasteReadandModify;

public class ToothpasteRunner {

	public static void main(String[] args) {
		
		Toothpaste toothpaste=new Toothpaste();
		ToothpasteReadandModify modify=new ToothpasteReadandModify();
		modify.useToothpaste(toothpaste);
	}
}
