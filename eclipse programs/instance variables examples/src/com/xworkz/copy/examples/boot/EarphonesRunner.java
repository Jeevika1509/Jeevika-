package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Earphones;

public class EarphonesRunner {

	public static void main(String[] args) {
		
		String[] items= {"mint green","blue","white"};
		
		String[] item2= {"wired","wireless"};
		
		int[] item3= {100,101};
		
		int[] item4= {1,2};
		
		String[] item5= {"5%","10%"};
		
		int[] item6= {350,400,600};
		
		Earphones earphones=new Earphones("boat",items,item2,item3,item4,137,1,item5,item6,true,"plastic");
		
		earphones.display();

	}

}
