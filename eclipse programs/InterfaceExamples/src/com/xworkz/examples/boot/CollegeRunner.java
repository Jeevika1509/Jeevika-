package com.xworkz.examples.boot;


import com.xworkz.examples.College;
import com.xworkz.examples.Students;

public class CollegeRunner {

	public static void main(String[] args) {

		Students student=new Students();
		student.beOnTimeToCol();
		student.completeAssignments();
		student.discipline();
		student.maintainAttendence();
		student.wearIdCard();
		System.out.println(System.lineSeparator());
		College college=new Students();
		college.beOnTimeToCol();
		college.completeAssignments();
		college.discipline();
		college.maintainAttendence();
		college.wearIdCard();
		
	}

}
