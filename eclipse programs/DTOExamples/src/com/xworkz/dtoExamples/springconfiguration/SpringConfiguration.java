package com.xworkz.dtoExamples.springconfiguration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.dtoExamples")
public class SpringConfiguration {

	@Bean
	public Validator validator() {
		System.out.println("registering validator");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}
}
