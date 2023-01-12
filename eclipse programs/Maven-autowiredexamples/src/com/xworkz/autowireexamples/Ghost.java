package com.xworkz.autowireexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {

	@Autowired
	@Qualifier("ghostName")
	private String name;
	@Autowired
	@Qualifier("ghostGender")
	private String gender;
	@Autowired
	@Qualifier("ghostArea")
	private String area;
	@Autowired
	@Qualifier("ghostCity")
	private String city;
	@Autowired
	@Qualifier("ghostDangerous")
	private boolean dangerous;
	@Autowired
	@Qualifier("ghostHeight")
	private double height;
	@Autowired
	@Qualifier("ghostState")
	private String state;
	@Autowired
	@Qualifier("ghostCountry")
	private String country;
	@Autowired
	@Qualifier("ghostNail")
	private boolean longNails;
	@Autowired
	@Qualifier("ghostCostume")
	private String costumeColor;
	
	private boolean scary;
	private String father;
	private String mother;
	private String friend;
	private String cousin;
	private boolean house;
	private boolean causeTrouble;
	private boolean killPeople;
	private double nailLength;
	private boolean longHair;
	
	@Autowired
	public Ghost(@Qualifier("isScary")boolean scary,@Qualifier("ghostFather")String father,@Qualifier("ghostMother")String mother,@Qualifier("ghostFriend")String friend,@Qualifier("ghostCousin")String cousin,@Qualifier("ghostHouse")boolean house,
			@Qualifier("ghostCauseTrouble")boolean causeTrouble,@Qualifier("ghostKillPeople")boolean killPeople,@Qualifier("ghostNailLength")double nailLength,@Qualifier("ghostLongHair")boolean longHair) {
		super();
		this.scary = scary;
		this.father = father;
		this.mother = mother;
		this.friend = friend;
		this.cousin = cousin;
		this.house = house;
		this.causeTrouble = causeTrouble;
		this.killPeople = killPeople;
		this.nailLength = nailLength;
		this.longHair = longHair;
	}
	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", area=" + area + ", city=" + city + ", dangerous="
				+ dangerous + ", height=" + height + ", state=" + state + ", country=" + country + ", longNails="
				+ longNails + ", costumeColor=" + costumeColor + ", scary=" + scary + ", father=" + father + ", mother="
				+ mother + ", friend=" + friend + ", cousin=" + cousin + ", house=" + house + ", causeTrouble="
				+ causeTrouble + ", killPeople=" + killPeople + ", nailLength=" + nailLength + ", longHair=" + longHair
				+ "]";
	}
	
}
