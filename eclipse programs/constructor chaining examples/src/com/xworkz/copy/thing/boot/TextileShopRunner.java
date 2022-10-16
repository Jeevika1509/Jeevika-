package com.xworkz.copy.thing.boot;
import com.xworkz.copy.thing.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		
		TextileShop textile=new TextileShop();
		
		System.out.println(textile.ownerName);
		System.out.println(textile.ownerWifeName);
		System.out.println(textile.ownerDaughterName);
		System.out.println(textile.ownerDaughterNumber);
		System.out.println(textile.ownerNoOfWifes);
		System.out.println(textile.shopNo);
		System.out.println(textile.contactNo);
		
		textile=new TextileShop("Santhosh");
		System.out.println("Textile shop owner name:"+textile.ownerName);
		
		textile=new TextileShop("Ramesh", "Priya");
		System.out.println("Textile shop owner name:"+textile.ownerName);
		System.out.println("Textile shop owner wife name:"+textile.ownerWifeName);
		
		textile=new TextileShop("Suresh", "Gita", "Hema");
		System.out.println("Textile shop owner name:"+textile.ownerName);
		System.out.println("Textile shop owner wife name:"+textile.ownerWifeName);
		System.out.println("Textile shop owner daughter name:"+textile.ownerDaughterName);
		
		textile=new TextileShop("Sunil", "Chitra", "Keerthi", 9331739817l);
		System.out.println("Textile shop owner name:"+textile.ownerName);
		System.out.println("Textile shop owner wife name:"+textile.ownerWifeName);
		System.out.println("Textile shop owner daughter name:"+textile.ownerDaughterName);
		System.out.println("Textile shop owner daughter number:"+textile.ownerDaughterNumber);
		
		textile=new TextileShop("Girish", "Girija", "preethi", 9221093484l, 1);
		System.out.println("Textile shop owner name:"+textile.ownerName);
		System.out.println("Textile shop owner wife name:"+textile.ownerWifeName);
		System.out.println("Textile shop owner daughter name:"+textile.ownerDaughterName);
		System.out.println("Textile shop owner daughter number:"+textile.ownerDaughterNumber);
		System.out.println("Textile shop owner number of wifes:"+textile.ownerNoOfWifes);
		
		textile=new TextileShop("Ranjith", "Ranjini", "Rakshitha", 9455609562l, 1, 5);
		System.out.println("Textile shop owner name:"+textile.ownerName);
		System.out.println("Textile shop owner wife name:"+textile.ownerWifeName);
		System.out.println("Textile shop owner daughter name:"+textile.ownerDaughterName);
		System.out.println("Textile shop owner daughter number:"+textile.ownerDaughterNumber);
		System.out.println("Textile shop owner number of wifes:"+textile.ownerNoOfWifes);
		System.out.println("Textile shop number:"+textile.shopNo);
		
		textile=new TextileShop("Rakshith", "Riya", "Kamala", 9776654195l, 1, 4, 9011234098l);
		System.out.println("Textile shop owner name:"+textile.ownerName);
		System.out.println("Textile shop owner wife name:"+textile.ownerWifeName);
		System.out.println("Textile shop owner daughter name:"+textile.ownerDaughterName);
		System.out.println("Textile shop owner daughter number:"+textile.ownerDaughterNumber);
		System.out.println("Textile shop owner number of wifes:"+textile.ownerNoOfWifes);
		System.out.println("Textile shop number:"+textile.shopNo);
		System.out.println("Textile shop contact number:"+textile.contactNo);
		

	}

}
