package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Mixie;
import com.xworkz.copy.examples.MixieReadandModify;

public class MixieRunner {

	public static void main(String[] args) {
	
		Mixie mixie=new Mixie();
		MixieReadandModify modify=new MixieReadandModify();
		modify.useMixie(mixie);

	}

}
