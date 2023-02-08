package main.java.com.xworkz.bakery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("main.java.com.xworkz.bakery")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
}
