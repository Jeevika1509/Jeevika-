package com.xworkz.examples.Map;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Company {

	public static void main(String[] args) {

		Map<String,String> ref=new LinkedHashMap<String,String>();
		ref.put("Accenture", "Global Village");
		ref.put("Wipro","Sarjapur" );
		ref.put("Infosys","Electronic City" );
		ref.put("TCS","Whitefield");
		ref.put("IBM","Bannerghatta Road");
		ref.put("Oracle","Marathalli");
		ref.put("Cognizant","Manyata tech park");
		ref.put("Cisco","Belandur");
		ref.put("Mindtree","Whitefield");
		ref.put("Capgemini","Whitefield");
		
		Set<String> keys=ref.keySet();
		keys.forEach(e->System.out.println(e));
		System.out.println("values");
		Collection<String> values=ref.values();
		values.forEach(v->System.out.println(v));
		System.out.println("Keys and values");
		Set<Entry<String,String>> entries=ref.entrySet();
		for(Entry<String,String> entry:entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
