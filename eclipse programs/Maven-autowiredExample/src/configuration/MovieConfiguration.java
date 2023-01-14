package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("src.autowireExamples")
public class MovieConfiguration {
	public MovieConfiguration() {
		System.out.println("MovieConfiguaration with no arguments");
	}
}
