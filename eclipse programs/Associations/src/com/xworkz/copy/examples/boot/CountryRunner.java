package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.City;
import com.xworkz.copy.examples.Country;
import com.xworkz.copy.examples.Name;
import com.xworkz.copy.examples.President;


public class CountryRunner {
	
	Country country = new Country("India");
	President president = new President("Droupadi Murmu");
	president.setGender(Gender.FEMALE);
	country.setPresident(president);
	
	Name name1 = new Name("Ramnath kovind","Pratibha Patil","Pranav Mukharji");
	City city1 = new City(name1,true,4355.5);
	

	
	Name name2 = new Name("Drupati Murmu","APG Abdul Kalam",null);
	
	City city2 = new City(name2,false,46456.35);
	
	
	City[] city = {city1,city2};
	
	country.setCities(city);
	
	country.display();
	

	
}
