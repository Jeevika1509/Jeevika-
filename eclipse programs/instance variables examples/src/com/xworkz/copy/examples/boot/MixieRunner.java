package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Mixie;

public class MixieRunner {

	public static void main(String[] args) {
		
		String[] items= {"83484","628585"};
		
		String[] item2= {"black","grey","blue"};
		
		double[] item3= {1.25,1.75};
		
		int[] item4= {2800,3000,4000};
		
		String[] item5= {"plastic","stainless steel"};
		
		Mixie mixie=new Mixie("butterfly",items,item2,18,51,item3,3,1,item4,true,item5,5);
		
		mixie.display();

	}

}
