package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Tyre;
import com.xworkz.copy.examples.TyreReadandModify;

public class TyreRunner {

	public static void main(String[] args) {
	
		Tyre tyre=new Tyre();
		TyreReadandModify modify=new TyreReadandModify();
		modify.useTyre(tyre);

	}

}
