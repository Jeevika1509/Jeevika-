package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Bulb;

public class BulbRunner {

	public static void main(String[] args) {
	
		String[] items= {"yellow","white"};
		
		String[] item2= {"B22D","D334"};
		
		String[] item3= {"halogen","led","cfl"};
		
		int[] item4= {300,350,400};
		
		int[] item5= {1,2,3,4};
		
		String[] item6={"plastic","alluminium"};
		
		Bulb bulb=new Bulb("syska",items,item2,item3,item4,3,true,item5,100,item6,true);
		
		bulb.display();


	}

}
