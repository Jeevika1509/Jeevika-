package com.xworkz.dtoExamples.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dtoExamples.dto.ResortDTO;
import com.xworkz.dtoExamples.service.ResortService;
import com.xworkz.dtoExamples.springconfiguration.SpringConfiguration;

public class ResortRunner {

	public static void main(String[] args) {

		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortService service=container.getBean(ResortService.class);
		boolean saved=service.validateAndSave(new ResortDTO());
		System.out.println("saved"+saved);
	}
	

}
