package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Watch;

public class WatchRunner {

	public static void main(String[] args) {
		
		String[] items= {"64848","75785"};
		
		String[] item2= {"analog","digital"};
		
		String[] item3= {"white","blue"};
		
		int[] item4= {1500,2000};
		
		String[] item5= {"stainless steel","alloy"};
		
		Watch watch=new Watch("fastrack",items,item2,item3,item4,1,true,false,item5,180,true);
		
		watch.display();

	}

}
