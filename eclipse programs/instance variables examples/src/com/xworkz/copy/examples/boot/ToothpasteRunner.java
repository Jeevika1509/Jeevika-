package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Toothpaste;

public class ToothpasteRunner {

	public static void main(String[] args) {
 
		String[] items= {"colgate","meswak","sensodyne"};
		
		String[] item2= {"minty","spicy","strawberry"};
		
		String[] item3= {"fluoride","triclosan","sodium bicarbonate","propylene glycon"};
		
		String[] item4= {"red","white","blue"};
		
		String[] item5= {"5 %","10%"};
		
		int[] item6= {1,2,3};
		
		
		Toothpaste toothpaste=new Toothpaste(items,item2,240,item3,item4,215,4564,"18 oct 2022","18 oct 2024",item5,item6);
		toothpaste.display();
	
		

	}

}


