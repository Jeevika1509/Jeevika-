package com.xworkz.examples.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.examples.DTO.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDTO sanitizerDTO1=new SanitizerDTO(1,"Dettol",213,"blue");
		SanitizerDTO sanitizerDTO2=new SanitizerDTO(2,"Yardley",148,"Transparent");
		SanitizerDTO sanitizerDTO3=new SanitizerDTO(3,"SterloMax",400,"white");
		SanitizerDTO sanitizerDTO4=new SanitizerDTO(4,"lifebuoy",250,"green");
		SanitizerDTO sanitizerDTO5=new SanitizerDTO(5,"himalaya",205,"red");
		SanitizerDTO sanitizerDTO6=new SanitizerDTO(6,"savlon",100,"blue");
		SanitizerDTO sanitizerDTO7=new SanitizerDTO(7,"wellcare",219,"pink");
		SanitizerDTO sanitizerDTO8=new SanitizerDTO(8,null,201,"white");
		SanitizerDTO sanitizerDTO9=new SanitizerDTO(9,"Sterillium",450,"transparent");
		SanitizerDTO sanitizerDTO10=new SanitizerDTO(10,"sanitron",300,"Transparent");
		
		Collection<SanitizerDTO> collection=new LinkedList<SanitizerDTO>();
		collection.add(sanitizerDTO1);
		collection.add(sanitizerDTO2);
		collection.add(sanitizerDTO3);
		collection.add(sanitizerDTO4);
		collection.add(sanitizerDTO5);
		collection.add(sanitizerDTO6);
		collection.add(sanitizerDTO7);
		collection.add(sanitizerDTO8);
		collection.add(sanitizerDTO9);
		collection.add(sanitizerDTO10);
		
		Iterator<SanitizerDTO> ref=collection.iterator();
		while(ref.hasNext()) {
			SanitizerDTO element=ref.next();
			System.out.println("element:"+element);
			System.out.println(System.lineSeparator());
			if(element.getPrice()>5) {
				System.out.println("sanitizer price greater than 5:"+element.getBrand());
			}
		}
		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> ref1=collection.iterator();
		while(ref1.hasNext()) {
			SanitizerDTO element=ref1.next();
			if(element.getId()==null || element.getBrand()==null || element.getPrice()==null || element.getColor()==null) {
				System.out.println("element which has null property:"+element);
			}
		
	   }
		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> ref2=collection.iterator();
		while(ref2.hasNext()) {
			SanitizerDTO element=ref2.next();
		if("green".equals(element.getColor()) || "red".equals(element.getColor()) ||"blue".equals(element.getColor())) {
			System.out.println("removing:"+element);
			ref2.remove();
		}
		}
		
}
}
