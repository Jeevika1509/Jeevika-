package com.xworkz.examples.Map;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Chocolate {

	public static void main(String[] args) {

		Map<String,Integer> ref=new LinkedHashMap<String,Integer>();
		ref.put("Dairy Milk",40);
		ref.put("Milky Bar",20);
		ref.put("5 Star",10);
		ref.put("Munch",5);
		ref.put("Galaxy",10);
		ref.put("KitKat",50);
		ref.put("Ferrero rocher",875);
		ref.put("Amul Dark chocolate",97);
		ref.put("Celebrations",457);
		ref.put("cadbury temptations",95);
		
		Set<String> keys=ref.keySet();
		keys.forEach(e->System.out.println(e));
		System.out.println("values");
		Collection<Integer> values=ref.values();
		values.forEach(v->System.out.println(v));
		System.out.println("Keys and values");
		Set<Entry <String,Integer>> entries=ref.entrySet();
		for(Entry<String,Integer> entry:entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
	}
	}
}
