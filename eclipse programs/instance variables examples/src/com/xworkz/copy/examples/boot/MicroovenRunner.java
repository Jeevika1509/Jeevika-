package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Microoven;

public class MicroovenRunner {

	public static void main(String[] args) {
	
		String[] items= {"86484","698585"};
		
		String[] item2= {"black","silver"};
		
		String[] item3= {"solo","grill","convection"};
		
		double[] item4= {23,28,32};
		
		int[] item5= {1,2,3,4};
		
		String[] item6= {"20%","30%"};
		
		Microoven microoven=new Microoven("samsung",items,47,51,item2,17,item3,10000,1,item4,item5,item6);
		
		microoven.display();

	}

}
