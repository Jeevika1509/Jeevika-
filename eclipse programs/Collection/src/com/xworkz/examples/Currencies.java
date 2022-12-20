package com.xworkz.examples;

import java.util.Collection;
import java.util.HashSet;

public class Currencies {

	public static void main(String[] args) {


		String currency1="Rupee";
		String currency2="US Dollar";
		String currency3="Euro";
		String currency4="Lek";
		String currency5="Dinar";
		String currency6="Peso";
		String currency7="Dram";
		String currency8="Australian Dollar";
		String currency9="Manat";
		String currency10="Bahamian Dollar";
		String currency11="Bahrain Dollar";
		String currency12="Taka";
		String currency13="Barbados Dollar";
		String currency14="Belorussian ruble";
		String currency15="Belize Dollar";
		String currency16="Boliviano";
		String currency17="Pula";
		String currency18="Real";
		String currency19="Brunei Dollar";
		String currency20="Lev";
		String currency21="Canadian Dollar";
		String currency22="Egyptian Pound";
		String currency23="Nakfa";
		String currency24="Fiji Dollar";
		String currency25="Lari";
		String currency26="Jordanian Dollar";
		
		Collection<String> collection=new HashSet();
		collection.add(currency1);
		collection.add(currency2);
		collection.add(currency3);
		collection.add(currency4);
		collection.add(currency5);
		collection.add(currency6);
		collection.add(currency7);
		collection.add(currency8);
		collection.add(currency9);
		collection.add(currency10);
		collection.add(currency11);
		collection.add(currency12);
		collection.add(currency13);
		collection.add(currency14);
		collection.add(currency15);
		collection.add(currency16);
		collection.add(currency17);
		collection.add(currency18);
		collection.add(currency19);
		collection.add(currency20);
		collection.add(currency21);
		collection.add(currency22);
		collection.add(currency23);
		collection.add(currency24);
		collection.add(currency25);
		collection.add(currency26);
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clearing the elements ");
		System.out.println(collection.size());
	}

}
