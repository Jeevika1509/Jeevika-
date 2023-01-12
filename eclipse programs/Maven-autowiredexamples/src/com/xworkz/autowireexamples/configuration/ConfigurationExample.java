package com.xworkz.autowireexamples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowireexamples")
public class ConfigurationExample {
	
	public ConfigurationExample() {
		System.out.println("Created configuration");
	}
	
	@Bean
	public int id() {
		System.out.println("registering id");
		int id=10;
		return id;
	}
	
	@Bean
	public String language() {
		System.out.println("registering language");
		String string=new String("Kannada");
		return string;
	}
	
	@Bean
	public String newspaperName() {
		System.out.println("registering newspaperName");
		String string=new String("vijayavani");
		return string;
	}
	
	@Bean
	public String newspaperOwner() {
		System.out.println("registering newspaper owner");
		String string=new String("Vijay Sankeshwar");
		return string;
	}
	
	@Bean
	public double newspaperPrice() {
		System.out.println("registering newspaper price");
		double ref=80;
		return ref;
	}
	
	@Bean
	public String engineName() {
		System.out.println("registering engine name");
		String string=new String("four stroke");
		return string;
	}
	
	@Bean
	public String engineType() {
		System.out.println("registering engine type");
		String string=new String("petrol");
		return string;
	}
	
	@Bean
	public int engineNumber() {
		System.out.println("registering engine number");
		int ref=658542;
		return ref;
	}
	
	@Bean
	public int engineVersion() {
		System.out.println("registering engine version");
		int version=2;
		return version;
	}
	
	@Bean
	public String engineCompany() {
		System.out.println("registering engine company");
		String string=new String("Suzuki");
		return string;
	}
	
	@Bean
	public int engineStroke() {
		System.out.println("registering engine stroke");
		int ref=4;
		return ref;
	}
	
	@Bean
	public String snakeName() {
		System.out.println("registering snake name");
		String string=new String("Cobra");
		return string;
	}
	
	@Bean
	public double snakelength() {
		System.out.println("registering snake length");
		double ref=18;
		return ref;
	}
	
	@Bean
	public String snakeColor() {
		System.out.println("registering snake color");
		String string=new String("black");
		return string;
	}
	
	@Bean
	public String snakeType() {
		System.out.println("registering snake type");
		String string=new String("King Cobra");
		return string;
	}
	
	@Bean
	public boolean isPoisonous() {
		System.out.println("registering snake poisonous");
		return true;
	}
	
	@Bean
	public String ghostName() {
		System.out.println("registering ghost name");
		String string=new String("Geetha");
		return string;
	}
	
	@Bean
	public String ghostGender() {
		System.out.println("registering ghost gender");
		String string=new String("Feamle");
		return string;
	}
	
	@Bean
	public String ghostArea() {
		System.out.println("registering ghost name");
		String string=new String("jayanagar");
		return string;
	}
	
	@Bean
	public String ghostCity() {
		System.out.println("registering ghost name");
		String string=new String("bangalore");
		return string;
	}
	
	@Bean
	public boolean ghostDangerous() {
		System.out.println("registering ghost dangerous");
		return true;
	}
	
	@Bean
	public double ghostHeight() {
		System.out.println("registering ghost height");
		double ref=5.8;
		return ref;
	}
	
	@Bean
	public String ghostState() {
		System.out.println("registering ghost state");
		String string=new String("karnataka");
		return string;
	}
	
	@Bean
	public String ghostCountry() {
		System.out.println("registering ghost country");
		String string=new String("India");
		return string;
	}
	
	@Bean
	public boolean ghostNail() {
		System.out.println("registering ghost nail");
		return true;
	}
	
	@Bean
	public String ghostCostume() {
		System.out.println("registering ghost costume");
		String string=new String("white");
		return string;
	}
	
	@Bean
	public boolean isScary() {
		System.out.println("registering scary");
		return true;
	}
	
	@Bean
	public String ghostFather() {
		System.out.println("registering ghost father");
		String string=new String("Ram");
		return string;
	}
	
	@Bean
	public String ghostMother() {
		System.out.println("registering ghost mother");
		String string=new String("Seetha");
		return string;
	}
	
	@Bean
	public String ghostFriend() {
		System.out.println("registering ghost friend");
		String string=new String("Priya");
		return string;
	}
	
	@Bean
	public String ghostCousin() {
		System.out.println("registering ghost cousin");
		String string=new String("Riya");
		return string;
	}
	
	@Bean
	public boolean ghostHouse() {
		System.out.println("registering ghost house");
		return true;
	}
	
	@Bean
	public boolean ghostCauseTrouble() {
		System.out.println("registering ghost cause trouble");
		return true;
	}
	
	@Bean
	public boolean ghostKillPeople() {
		System.out.println("registering ghostKillPeople");
		return false;
	}
	
	@Bean
	public double ghostNailLength() {
		System.out.println("registering ghostNailLength");
		double ref=2.5;
		return ref;
	}
	
	@Bean
	public boolean ghostLongHair() {
		System.out.println("registering ghostLongHair");
		return false;
	}
	
	
	
	
	

}
