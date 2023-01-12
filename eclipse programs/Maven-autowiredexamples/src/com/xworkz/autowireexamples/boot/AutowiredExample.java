package com.xworkz.autowireexamples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowireexamples.Engine;
import com.xworkz.autowireexamples.Ghost;
import com.xworkz.autowireexamples.Newspaper;
import com.xworkz.autowireexamples.Snake;
import com.xworkz.autowireexamples.configuration.ConfigurationExample;



public class AutowiredExample {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationExample.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Newspaper newspaper=container.getBean(Newspaper.class);
		System.out.println(newspaper.toString());
		
		Engine engine=container.getBean(Engine.class);
		System.out.println(engine.toString());
		
		Snake snake=container.getBean(Snake.class);
		System.out.println(snake.toString());
		
		Ghost ghost=container.getBean(Ghost.class);
		System.out.println(ghost.toString());
	}

}
