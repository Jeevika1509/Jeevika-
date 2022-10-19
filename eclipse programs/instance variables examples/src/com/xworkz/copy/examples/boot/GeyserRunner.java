package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Geyser;

public class GeyserRunner {

	public static void main(String[] args) {
	
		String[] items= {"451873","246974","347238"};
		
		double[] item2= {3500,3600,5000};
		
		double[] item3= {3,15,25};
		
		String[] item4= {"white","blue","grey"};
		
		int[] item5= {1,2,3};
		
		Geyser geyser=new Geyser("havells",items,item2,item3,37.3,22.5,item4,3000,2,item5,true);
		
		geyser.display();

	}

}
