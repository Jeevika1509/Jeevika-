package boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autowireExamples.Movie;
import configuration.MovieConfiguration;

public class AutowireExampleRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Movie ref=container.getBean(Movie.class);
		System.out.println(ref);
	}

}
