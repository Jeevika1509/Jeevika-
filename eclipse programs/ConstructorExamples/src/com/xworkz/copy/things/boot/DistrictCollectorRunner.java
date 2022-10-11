package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		DistrictCollector district1=new DistrictCollector();
		System.out.println(district1.name);
		System.out.println(district1.age);
		System.out.println(district1.district);
		System.out.println(district1.batchNo);
		district1.name="Srinivas";
		district1.age=30;
		district1.district="Bangalore Urban";
		district1.batchNo=2012;
		System.out.println(district1.name);
		System.out.println(district1.age);
		System.out.println(district1.district);
		System.out.println(district1.batchNo);
		

	}
}
