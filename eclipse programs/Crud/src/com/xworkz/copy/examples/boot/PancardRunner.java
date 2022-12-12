package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.PancardList;
import com.xworkz.copy.examples.Pancards;

public class PancardRunner {

	public static void main(String[] args) {

		Pancards pancard=new PancardList();
		pancard.create("ck2871");
		pancard.create("gd325");
		pancard.create("cds346");
		pancard.create("se345");
		pancard.create("dg839");
		pancard.create("dj348");
		pancard.create("dgv389");
		pancard.create("ahs230");
		pancard.create("sjd359");
		pancard.create("dgd290");
		System.out.println(pancard.total());
	}

}
