package com.xworkz.springexamples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springexamples.examples.Actor;
import com.xworkz.springexamples.examples.Rocket;
import com.xworkz.springexamples.examples.Season;

@Configuration
@ComponentScan("com.xworkz.springexamples.examples")
public class Config {

	public Config() {
		System.out.println("created Configuration ");
		
	}
	
	@Bean
	public Rocket satellite() {
		System.out.println("registering rocket with spring");
		Rocket rocket=new Rocket();
		return rocket;
	}
	
	@Bean
	public Actor movies() {
		System.out.println("registering actor with spring");
		Actor actor=new Actor("Darshan","Kannada",50);
		return actor;
	}
	
	@Bean
	public Season autumn() {
		System.out.println("registering season with spring");
		Season season=new Season();
		return season;
	}
}
