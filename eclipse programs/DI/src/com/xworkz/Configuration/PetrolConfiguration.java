package com.xworkz.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.example")
public class PetrolConfiguration {

	public PetrolConfiguration() {
		System.out.println("running configuration");
	}
}
