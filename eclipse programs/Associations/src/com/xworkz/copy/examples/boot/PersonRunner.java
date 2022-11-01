package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.onetomany.Address;
import com.xworkz.copy.examples.onetomany.City1;
import com.xworkz.copy.examples.onetomany.Company;
import com.xworkz.copy.examples.onetomany.Country1;
import com.xworkz.copy.examples.onetomany.Email;
import com.xworkz.copy.examples.onetomany.Job;
import com.xworkz.copy.examples.onetomany.Location;
import com.xworkz.copy.examples.onetomany.Person;
import com.xworkz.copy.examples.onetomany.State;

public class PersonRunner {

	public static void main(String[] args) {
		
		Country1 country1=new Country1("India","delhi",29,true);
		
		State state=new State("mysore state","karnataka","bangalore","India");
		
		City1 city1=new City1("Bangalore","rr nagar",560098,11.72);
		
		Location location=new Location(3,"avenue road");
		location.setCity1(city1);
		location.setCountry1(country1);
		location.setState(state);
		
		Address address=new Address(location);
		
		Company company=new Company("Infosys", "Narayan Murthy");
		
		company.setAddress(address);
		
		Job job=new Job(35000,"developer",2);
		
		job.setCompany(company);
		
		Email email1 = new Email("spoorthi@gmail.com","spoorthig",9854748123l);
		
		Email email2=new Email("jeevika@gmail.com","jeevika",9298475458l);
		
		Email[] emails = {email1,email2};
        		
		Person person=new Person("spoorthi");
		
		person.setJob(job);
		
		person.setEmail(emails);
		
		person.showOff8();
		
		
		
		
	}

}
