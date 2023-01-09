package com.xworkz.examples.Map;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PG {

	public static void main(String[] args) {

		Map<String,Integer> ref=new LinkedHashMap<String,Integer>();
		ref.put("Kushi",7000);
		ref.put("golden",8000);
		ref.put("Ganga ladies pg",6000);
		ref.put("Neha pg",7500);
		ref.put("Annapoorneshwari pg",5000);
		ref.put("durga ladies pg",4000);
		ref.put("akshaya pg",4500);
		ref.put("Bhakthi ladies pg",8500);
		ref.put("Ideal Home girls",9000);
		ref.put("Shreevari pg",6500);
		
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
