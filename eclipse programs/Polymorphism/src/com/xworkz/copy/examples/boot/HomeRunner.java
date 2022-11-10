package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Pg;

public class HomeRunner {
	
	public static void main(String args[]) {
		
		Pg pg=new Pg();
		pg.providesSecurity();
		pg.stay();
	}

}
