package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Configuration.PetrolConfiguration;
import com.xworkz.example.PetrolBunk;
import com.xworkz.example.Shell;

public class PetrolRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(PetrolConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		PetrolBunk ref=container.getBean(PetrolBunk.class);
		ref.purchase();
		
	}
}
