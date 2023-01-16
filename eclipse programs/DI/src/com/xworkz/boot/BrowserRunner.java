package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Configuration.BrowserConfiguration;
import com.xworkz.example.Chrome;
import com.xworkz.example.Firefox;



public class BrowserRunner {
	
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Chrome chrome=container.getBean(Chrome.class);
		chrome.browse();
		
		Firefox firefox=container.getBean(Firefox.class);
		firefox.browse();
	}

}
