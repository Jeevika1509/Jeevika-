package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Watch;
import com.xworkz.copy.examples.WatchReadandModify;

public class WatchRunner {

	public static void main(String[] args) {
		
		Watch watch=new Watch();
		WatchReadandModify modify=new WatchReadandModify();
		modify.useWatch(watch);

	}

}
