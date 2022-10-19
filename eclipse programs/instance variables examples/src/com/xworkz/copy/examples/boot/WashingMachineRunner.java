package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.WashingMachine;
import com.xworkz.copy.examples.boot.colors.colors;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		WashingMachine washing=new WashingMachine("samsung","front load",colors.BLACK,7,30000);
		
		washing.display();
		

	}

}
