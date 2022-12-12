package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.EmailList;
import com.xworkz.copy.examples.Emails;

public class EmailRunner {

	public static void main(String[] args) {

		Emails email=new EmailList();
		email.create("jeevika.xworkz@gmail.com");
		email.create("spoorthi.xworkz@gmail.com");
		email.create("smruthi.xworkz@gmail.com");
		email.create("sinchana.xworkz@gmail.com");
		email.create("harshitha.xworkz@gmail.com");
		email.create("aishwarya.xworkz@gmail.com");
		email.create("swathi.xworkz@gmail.com");
		email.create("sahana.xworkz@gmail.com");
		email.create("rashmi.xworkz@gmail.com");
		email.create("anusha.xworkz@gmail.com");
		System.out.println(email.total());
		
;	}

}
