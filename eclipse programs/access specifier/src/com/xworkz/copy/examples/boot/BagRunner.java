package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Bag;
import com.xworkz.copy.examples.BagReadandModify;

public class BagRunner {
	
	public static void main(String[] args)
	{
		
		Bag bag=new Bag();
		BagReadandModify modify=new BagReadandModify();
		modify.useBag(bag);
		
	}

}
