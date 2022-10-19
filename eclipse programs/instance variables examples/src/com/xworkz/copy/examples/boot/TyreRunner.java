package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Bulb;
import com.xworkz.copy.examples.Tyre;

public class TyreRunner {

	public static void main(String[] args) {
		
		String[] items= {"pr15,ps718"};
		
		String[] item2= {"tubed","tubeless"};
		
		int[] item3= {450,1400,1500};
		
		int[] item4= {1,2};
		
		float[] item5= {250,260};
		
		String[] item6= {"natural rubber","synthetic rubber"};
		
		Tyre tyre=new Tyre("TVS Eurogrip",items,item2,"black",3,item3,item4,item5,59,9,59,item6);
		
		tyre.display();
		

	}

}
