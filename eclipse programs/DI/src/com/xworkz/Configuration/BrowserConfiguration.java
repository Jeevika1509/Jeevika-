package com.xworkz.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.example")
public class BrowserConfiguration {

	public BrowserConfiguration() {
		System.out.println("running configuration");
	}

}
