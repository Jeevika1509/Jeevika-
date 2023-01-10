package com.xworkz.springexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springexamples")
public class SpringConfiguration {

	@Bean("String Train")
	public String train() {
		System.out.println("registering train with spring");
		String string=new String();
		return string;
	}
	
	@Bean("String Metro")
	public String metro() {
		System.out.println("registering metro train with spring");
		String string=new String();
		return string;
	}
	
	@Bean("String Earphones")
	public String earphones() {
		System.out.println("registering earphones with spring");
		String string=new String();
		return string;
	}
	
	@Bean("String Speaker")
	public String speaker() {
		System.out.println("registering speaker with spring");
		String string=new String();
		return string;
	}
	
	@Bean("String Watch")
	public String watch() {
		System.out.println("registering watch with spring");
		String string=new String();
		return string;
	}
	
	@Bean("Boolean Breakfast")
	public Boolean hadBreakfast() {
		System.out.println("Registering hadBreakfast with spring");
		Boolean boolean1 = new Boolean(false);
		return boolean1;
	}
	
	@Bean("Boolean hadLunch")
	public Boolean hadLunch() {
		System.out.println("Registering hadLunch with spring");
		Boolean boolean2 = new Boolean(false);
		return boolean2;
	}
	
	@Bean("Boolean hadDinner")
	public Boolean hadDinner() {
		System.out.println("Registering hadDinner with spring");
		Boolean boolean3 = new Boolean(false);
		return boolean3;
	}
	
	@Bean("Boolean Studied")
	public Boolean studied() {
		System.out.println("Registering studied with spring");
		Boolean boolean4 = new Boolean(false);
		return boolean4;
	}
	
	@Bean("Boolean Writing")
	public Boolean writing() {
		System.out.println("Registering Writing with spring");
		Boolean boolean5 = new Boolean(false);
		return boolean5;
	}
	
	@Bean("Double ticketPrice")
	public double ticketPrice() {
		System.out.println("Registering ticketPrice with spring");
		double d = new Double(0.0);
		return d;
	}
	
	@Bean("Double avg")
	public double avg() {
		System.out.println("Registering avg with spring");
		double d = new Double(0.0);
		return d;
	}
	
	@Bean("Double sum")
	public double sum() {
		System.out.println("Registering sum with spring");
		double d = new Double(0.0);
		return d;
	}
	
	@Bean("Double total")
	public double total() {
		System.out.println("Registering total with spring");
		double d = new Double(0.0);
		return d;
	}
	
	@Bean("Double productPrice")
	public double productPrice() {
		System.out.println("Registering productPrice with spring");
		double d = new Double(0.0);
		return d;
	}
	
	@Bean("StringBuffer walk ")
	public StringBuffer walk() {
		System.out.println("Registering walk with spring");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}
	
	@Bean("StringBuffer sleeping")
	public StringBuffer sleeping() {
		System.out.println("Registering sleeping with spring");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}
	
	@Bean("StringBuffer run")
	public StringBuffer run() {
		System.out.println("Registering run with spring");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}
	
	@Bean("StringBuffer jog")
	public StringBuffer jog() {
		System.out.println("Registering jog with spring");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}
	
	@Bean("StringBuffer yoga")
	public StringBuffer yoga() {
		System.out.println("Registering yoga with spring");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}
	
	@Bean("StringBuilder write")
	public StringBuilder write() {
		System.out.println("Registering write with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}
	
	@Bean("StringBuilder read")
	public StringBuilder read() {
		System.out.println("Registering read with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}
	
	@Bean("StringBuilder watchMovie")
	public StringBuilder watchMovie() {
		System.out.println("Registering watchMovie with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}
	
	@Bean("StringBuilder playBadminton")
	public StringBuilder playBadminton() {
		System.out.println("Registering playBadminton with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}
	
	@Bean("StringBuilder listeningMusic")
	public StringBuilder listeningMusic() {
		System.out.println("Registering listeningMusic with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}
	
	@Bean("collect")
	public Collection<Integer> collect() {
		System.out.println("Registering list of integers with spring");
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);
		collection.add(5);

		return collection;
	}
	
	@Bean("pair")
	public Map<String, Integer> pair() {
		System.out.println("Registering key value pair with spring");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("KGF",300);
		map.put("Love Mocktail",250);
		map.put("Kantara",200);
		map.put("Ram setu", 200);
		map.put("Yashoda",250);

		return map;

	}
}
