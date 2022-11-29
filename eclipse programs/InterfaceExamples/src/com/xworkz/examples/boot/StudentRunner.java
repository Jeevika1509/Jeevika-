package com.xworkz.examples.boot;

import com.xworkz.examples.School;
import com.xworkz.examples.Student;

public class StudentRunner {

	public static void main(String[] args) {
		Student student=new Student();
		student.attendence();
		student.disciplined();
		student.uniform();
		student.idcard();
		student.homework();
		
		System.out.println(System.lineSeparator());
		School school=new Student();
		school.attendence();
		school.disciplined();
		school.uniform();
		school.idcard();
		school.homework();
		
		
		
		}

}
