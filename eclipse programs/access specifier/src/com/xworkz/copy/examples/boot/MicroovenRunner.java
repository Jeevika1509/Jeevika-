package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Microoven;
import com.xworkz.copy.examples.MicroovenReadandModify;

public class MicroovenRunner {

	public static void main(String[] args) {
		
		Microoven microoven=new Microoven();
		MicroovenReadandModify modify=new MicroovenReadandModify();
		modify.useMicrooven(microoven);


	}

}
