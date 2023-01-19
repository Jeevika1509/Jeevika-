package com.xworkz.dtoExamples.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dtoExamples.dto.MissileDTO;
import com.xworkz.dtoExamples.service.MissileService;
import com.xworkz.dtoExamples.springconfiguration.SpringConfiguration;

public class MissileRunner {

	public static void main(String[] args) {

		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileService service=container.getBean(MissileService.class);
		boolean saved=service.validateAndSave(new MissileDTO());
		System.out.println("saved"+saved);
	}

}
