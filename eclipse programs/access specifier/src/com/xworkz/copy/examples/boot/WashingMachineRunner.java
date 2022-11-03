package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.WashingMachine;
import com.xworkz.copy.examples.WashingMachineReadandModify;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		WashingMachine washingmachine=new WashingMachine();
		WashingMachineReadandModify modify=new WashingMachineReadandModify();
		modify.useWashingMachine(washingmachine);

	}

}
