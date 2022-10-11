package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		Developer developer=new Developer();
		System.out.println(developer.name);
		System.out.println(developer.education);
		System.out.println(developer.experience);
		System.out.println(developer.salary);
		System.out.println(developer.company);
		developer.name="Vani";
		developer.education="Engineering";
		developer.experience="fresher";
		developer.salary=4.0f;
		developer.company="cognizant";
		System.out.println(developer.name);
		System.out.println(developer.education);
		System.out.println(developer.experience);
		System.out.println(developer.salary);
		System.out.println(developer.company);

	}

}
