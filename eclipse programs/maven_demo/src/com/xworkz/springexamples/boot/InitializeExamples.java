package com.xworkz.springexamples.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springexamples.configuration.Config;
import com.xworkz.springexamples.examples.Actor;
import com.xworkz.springexamples.examples.Rocket;
import com.xworkz.springexamples.examples.Season;

public class InitializeExamples {

	public static void main(String[] args) {

		ApplicationContext spring=new AnnotationConfigApplicationContext(Config.class);
		Rocket refOfRocket=spring.getBean("rocket",Rocket.class);
		System.out.println(refOfRocket.toString());
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());

		Rocket refOfRocket2=spring.getBean("satellite",Rocket.class);
		System.out.println(refOfRocket.toString());
		System.out.println(refOfRocket2.getCountry());
		System.out.println(refOfRocket2.getName());
		System.out.println(refOfRocket2.getBudget());
		
		Actor refOfActor=spring.getBean("actor",Actor.class);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getAge());
		
		Actor refOfActor2=spring.getBean("movies",Actor.class);
		System.out.println(refOfActor2.getName());
		System.out.println(refOfActor2.getLanguage());
		System.out.println(refOfActor2.getAge());
		
		Season refOfSeason=spring.getBean("season",Season.class);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getDuration());
		System.out.println(refOfSeason.getStartingMonth());
		
		Season refOfSeason1=spring.getBean("autumn",Season.class);
		System.out.println(refOfSeason1.getName());
		System.out.println(refOfSeason1.getDuration());
		System.out.println(refOfSeason1.getStartingMonth());
	}

}
