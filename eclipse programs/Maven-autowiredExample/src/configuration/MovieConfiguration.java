package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(" com.xworkz.spring")
public class MovieConfiguration {
	public MovieConfiguration() {
		System.out.println("MovieConfiguaration with no arguments");
	}
}
