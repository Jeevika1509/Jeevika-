package main.java.com.xworkz.fooditem.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("main.java.com.xworkz.fooditem")
public class FoodItemConfiguration {

	public FoodItemConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
