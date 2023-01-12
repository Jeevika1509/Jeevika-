package com.xworkz.springexamples.Configurations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.springexamples.AutowireExamples")
public class AutowireExampleconfig{

	public AutowireExampleconfig() {
		System.out.println("Created configuration");
	}
	
	@Bean
	public int ID() {
		System.out.println("registering id ");
		int ref=10;
		return ref;
	}
	
	@Bean
	public String shopName() {
		System.out.println("registering shop name");
		String string=new String("Sadhana Hardware shop");
		return string;
	}
	
	@Bean
	public int gst() {
		System.out.println("registering gst");
		int ref=76858;
		return ref;
	}
	
	@Bean
	public String owner() {
		System.out.println("registering owner name");
		String string=new String("Sadhana");
		return string;
	}
	
	@Bean
	public String place() {
		System.out.println("registering address");
		String string=new String("Vijaynagar");
		return string;
	}
	
	@Bean
	public String softwareName() {
		System.out.println("registering name");
		String string=new String("Instagram");
		return string;
	}
	
	@Bean
	public int version() {
		System.out.println("registering version");
		int ref=237;
		return ref;
	}
	
	@Bean
	public String softwareDeveloper() {
		System.out.println("registering developer");
		String string=new String("Kevin");
		return string;
	}
	
	@Bean
	public Date date() {
		System.out.println("registering date");
		Date date=new Date(2022,05,12);
		return date;
	}
	@Bean
	public boolean free() {
		System.out.println("registering bean");
		return true;
	}
	
	@Bean
	public String engineerName() {
		System.out.println("registering name");
		String string=new String("vani");
		return string;
	}
	
	@Bean
	public double amount() {
		System.out.println("registering salary");
		double ref=20000;
		return ref;
		
	}
	
	@Bean
	public String companyName() {
		System.out.println("registering company");
		String string=new String("TCS");
		return string;
	}
	
	@Bean
	public double years() {
		System.out.println("registering years");
		double ref=1;
		return ref;
	}
	
	@Bean
	public String pencilName() {
		System.out.println("registering pencil name");
		String string=new String("apsara");
		return string;
	}
	
	@Bean
	public String pencilType() {
		System.out.println("registering pencil type");
		String string=new String("2B");
		return string;
	}
	
	@Bean
	public double price() {
		System.out.println("registering pencil price");
		double ref=8;
		return ref;
	}
	
	@Bean
	public String pencilColor() {
		System.out.println("registering pencil color");
		String string=new String("Black");
		return string;
	}
	
	@Bean
	public boolean isSharp() {
		System.out.println("registering sharp");
		return true;
	}
	
	@Bean
	public boolean isStolen() {
		System.out.println("registering stolen");
		return false;
	}
	
	@Bean
	public String rubberName() {
		System.out.println("registering rubber name");
		String string=new String("apsara");
		return string;
	}
	@Bean
	public String rubberType() {
		System.out.println("registering rubber type");
		String string=new String("Pencil eraser");
		return string;
	}
	
	@Bean
	public double price1() {
		System.out.println("registering rubber name");
		double ref=10;
		return ref;
	}
	
	@Bean
	public String rubberColor() {
		System.out.println("registering rubber color");
		String string=new String("white");
		return string;
	}
	
	@Bean
	public String rubberShape() {
		System.out.println("registering rubber name");
		String string=new String("Cuboidal");
		return string;
	}
	
	@Bean
	public boolean stolen() {
		System.out.println("registering stolen");
		return false;
	}
	@Bean
	public String rubberSize() {
		System.out.println("registering rubber size");
		String string=new String("Small");
		return string;
	}
	
	@Bean
	public String watchName() {
		System.out.println("registering watch name");
		String string=new String("Fastrack");
		return string;
	}
	
	@Bean
	public double watchPrice() {
		System.out.println("registering watchPrice");
		double ref=2000;
		return ref;
	}
	
	@Bean
	public int warranty() {
		System.out.println("registering warranty");
		int ref=2;
		return ref;
	}
	
	@Bean
	public boolean working() {
		System.out.println("registering working");
		return true;
	}
	
	@Bean
	public byte quantity() {
		System.out.println("registering quantity");
		byte ref=1;
		return ref;
	}
	
	@Bean
	public short offer() {
		System.out.println("registering offer");
		short ref=10;
		return ref;
	}
	
	@Bean
	public char size() {
		System.out.println("registering watch size");
		char ref='M';
		return ref;
	}
	
	@Bean
	public float bandwidth() {
		System.out.println("registering watch Bandwidth");
		float ref=19.8f;
		return ref;
	}
	
	@Bean
	public long modelNo() {
		System.out.println("registering watch model number");
		long ref=27648714;
		return ref;
	}
}
