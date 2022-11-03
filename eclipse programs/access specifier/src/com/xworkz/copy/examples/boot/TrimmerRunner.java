package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Trimmer;
import com.xworkz.copy.examples.TrimmerReadandModify;

public class TrimmerRunner {

	public static void main(String[] args) {
		
		Trimmer trimmer=new Trimmer();
		TrimmerReadandModify modify=new TrimmerReadandModify();
		modify.useTrimmer(trimmer);
	}

	

}
