package com.xworkz.dtoExamples.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dtoExamples.dto.FirstAidDTO;
import com.xworkz.dtoExamples.service.FirstAidService;
import com.xworkz.dtoExamples.springconfiguration.SpringConfiguration;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service=container.getBean(FirstAidService.class);
		boolean saved=service.validateAndSave(new FirstAidDTO());
		System.out.println("saved"+saved);
	}

}
