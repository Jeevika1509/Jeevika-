package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Fridge;

public class FridgeRunner {
		
		public static void main(String[] args) {
			 
			String[] items= {"grey","black","red"};
			
			int[] item2= {2,3};
			
			String[] item3= {"3437","6859","9077"};
			
			double[] item4= {260,400,594};
			
			double[] item5= {15000,20000};
			
			String[] item6= {"15%","20%"};
			
		
			
			
			Fridge fridge=new Fridge("whirpool",items,item2,item3,67,57,56,item4,item5,item6,1);
			
			fridge.display();

	}

}
