package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Currency;
import com.xworkz.copy.examples.God;

public class CurrencyRunner {

	public static void main(String[] args) {
		
		Currency currency=new Currency();
		currency.setName("Indian Currency");
		currency.setAcceptable(true);
		currency.setColor("green");
		currency.setConvertingPrice(20);
		currency.setCountry("India");
		currency.setMaterial("paper");
		currency.setSymbol("rupees");
		currency.setType("note");
		currency.setSerialNumber(4739445);
		currency.setYearOfIssue(2022);
		
		
		Currency currency2=new Currency("US dollar","US","$",true,"green","paper",72,2022,"note",328485);
		boolean same=currency.equals(currency2);
		System.out.println(same);


	}

}
