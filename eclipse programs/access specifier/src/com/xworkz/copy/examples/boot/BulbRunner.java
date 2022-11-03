package com.xworkz.copy.examples.boot;
import com.xworkz.copy.examples.Bulb;
import com.xworkz.copy.examples.BulbReadandModify;

public class BulbRunner {
	
	public static void main(String[] args) {
		
		Bulb Bulb=new Bulb();
		BulbReadandModify modify=new BulbReadandModify();
		modify.useBulb(Bulb);
	}
	


}
