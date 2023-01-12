package com.xworkz.springexamples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springexamples.AutowireExamples.HardwareShop;
import com.xworkz.springexamples.AutowireExamples.Pencil;
import com.xworkz.springexamples.AutowireExamples.Rubber;
import com.xworkz.springexamples.AutowireExamples.Software;
import com.xworkz.springexamples.AutowireExamples.SoftwareEngineer;
import com.xworkz.springexamples.AutowireExamples.Watch;
import com.xworkz.springexamples.Configurations.AutowireExampleconfig;

public class AutowiredExampleRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(AutowireExampleconfig.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		HardwareShop shop = container.getBean(HardwareShop.class);
		System.out.println(shop.toString());
		
		Software software=container.getBean(Software.class);
		System.out.println(software.toString());
		
		SoftwareEngineer engineer=container.getBean(SoftwareEngineer.class);
		System.out.println(engineer.toString());
		
		Pencil pencil=container.getBean(Pencil.class);
		System.out.println(pencil.toString());
		
		Rubber rubber=container.getBean(Rubber.class);
		System.out.println(rubber.toString());
		
		Watch watch=container.getBean(Watch.class);
		System.out.println(watch.toString());
		
		
	}
}
