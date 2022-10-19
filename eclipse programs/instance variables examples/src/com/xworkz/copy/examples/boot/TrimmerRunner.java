package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Trimmer;

public class TrimmerRunner {

	public static void main(String[] args) {
		
		String[] items= {"black","blue"};
		
		String[] item2= {"hair trimmer","beard","ear and nose trimmer"};
		
		int[] item3= {1000,1600,2000};
		
		int[] item4= {1,2};
		
		String[] item5= {"Mg37","Mg35"};
		
		Trimmer trimmer=new Trimmer("phillips",items,item2,item3,true,1,item4,0.45,"rubber",item5,13,16,27);
		
		trimmer.display();
		

	}

}
