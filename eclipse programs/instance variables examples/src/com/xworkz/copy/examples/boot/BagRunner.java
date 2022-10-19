package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Bag;


public class BagRunner {

	
	public static void main(String[] args) {
		 
		String[] items= {"lavie","baggit","mango","allen solly"};
		
		String[] item2= {"black","blue","grey"};
		
		double[] item3= {500,1000,2000};
		
		String[] item4= {"leather","nylon","mesh"};
		
		String[] item5= {"8%","10%"};
		
		int[] item6= {2,3,4};
		
		
		Bag bag=new Bag(items,item2,item3,1,true,false,item4,false,5,item5,item6);
		
		bag.display();
}
}
