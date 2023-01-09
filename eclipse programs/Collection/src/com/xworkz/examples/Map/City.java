package com.xworkz.examples.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class City {

	public static void main(String[] args) {

		Map<String,Integer> ref=new LinkedHashMap<String,Integer>();
		ref.put("Bengaluru",23);
		ref.put("Mumbai",25);
		ref.put("Kolkata",26);
		ref.put("Chennai",25);
		ref.put("Pune",26);
		ref.put("Kanpur",20);
		ref.put("Indore",22);
		ref.put("Patna",21);
		ref.put("Bhopal",22);
		ref.put("Agra",19);
		
		Set<String> keys=ref.keySet();
		keys.forEach(e->System.out.println(e));
		System.out.println("values");
		Collection<Integer> values=ref.values();
		values.forEach(v->System.out.println(v));
		System.out.println("Keys and values");
		Set<Entry<String,Integer>> entries=ref.entrySet();
		for(Entry<String,Integer> entry:entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
