package com.xworkz.examples.Map;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Pincode {

	public static void main(String[] args) {

		Map<Integer,String> ref=new LinkedHashMap<Integer,String>();
		ref.put(560098,"Rajarajeshwari Nagar");
		ref.put(560063,"Yelahanka");
		ref.put(560034,"Agara");
		ref.put(562107,"Attibele");
		ref.put(560026,"Avalahalli");
		ref.put(560002,"Avenue Road");
		ref.put(560050,"Banashankari");
		ref.put(560076,"Bannerghatta Road");
		ref.put(560026,"Bapujinagar");
		ref.put(560004,"Basavangudi");
	
		
		Set<Integer> keys=ref.keySet();
		keys.forEach(e->System.out.println(e));
		System.out.println("values");
		Collection<String> values=ref.values();
		values.forEach(v->System.out.println(v));
		System.out.println("Keys and values");
		Set<Entry<Integer,String>> entries=ref.entrySet();
		for(Entry<Integer,String> entry:entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
	}
	}

}
