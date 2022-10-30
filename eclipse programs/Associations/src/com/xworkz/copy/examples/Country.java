package com.xworkz.copy.examples;

public class Country {

		public String name;
		public City[] cities;
		public President president;
		
		
		public Country(String name)
		{
			this.name = name;
			
		}
		
		public void setCities(City[] cities)
		{
			this.cities = cities;
		}
		
		public void setPresident(President president)
		{
			this.president = president;
		}
		
		public void display()
		{
			if (cities!=null)
			{
			
				for (int i = 0; i < cities.length; i++)
				{
					City city = cities[i];	
					
					
					if(city!=null)
					{
						System.out.println("Name of the president,Capital or not and Area in Square km");
						city.show();
					}
				}
			}
				else
				{
					System.out.println("it is a null value");
				}
			
			if(president!=null)
			{
				
				System.out.println("Country name and President name:");
				this.president.showOff();
				
			}
			else
			{
				System.out.println("it is a null value");
			}
			
		
			System.out.println(this.name);
				
			}
			
}
