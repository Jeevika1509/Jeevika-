package com.xworkz.copy.examples.Service;

import com.xworkz.copy.examples.constant.PizzaSize;
import com.xworkz.copy.examples.constant.Type;
import com.xworkz.copy.examples.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService{


	private static final int VEG = 0;
	private static final int NONVEG = 0;

	@Override
	public boolean validateAndSave(PizzaDTO dto) {

		System.out.println("running validateAndSave"+dto);
		String name=dto.getName();
		double price=dto.getPrice();
		String company=dto.getCompany();
		PizzaSize size=dto.getSize();
		String flavour=dto.getFlavour();
		Type type=dto.getType();
		boolean validSize=false;
		boolean validCompany=false;
		boolean validName=false;
		boolean validPrice=false;
		boolean validType=false;
		boolean validFlavour=false;
		
		if(name!=null&&name.length()>=4&&name.length()<=20) {
		
			
			System.out.println("valid pizza name"+name);
			validName=true;
		}
		else {
			System.err.println("Invalid pizza name"+name);
		}
		
		if(price >= 50 && price<=2000) {
			System.out.println("valid price"+price);
			validPrice=true;

		}else {
			System.err.println("Invalid price"+price);
		}
		if(company!=null&&company.length()>=4&&company.length()<=20) {
			System.out.println("valid company"+company);
			validCompany=true;
		}
		else {
			System.err.println("Invalid company"+company);
		}
		
		if(size!=null) {
			System.out.println("valid size"+size);
			validSize=true;
			
		}
		else {
			System.err.println("Invalid size"+size);
		}
		if(flavour!=null&&flavour.length()>=3&&flavour.length()<=20) {
			System.out.println("valid flavour"+flavour);
			validFlavour=true;
		}
		else {
			System.err.println("Invalid flavour"+flavour);
		}
	
		if(type!=null && type.length()<=VEG && type.length()<=NONVEG) {
			System.out.println("Valid type"+type);
			validType=true;
			
		}
		else {
			System.err.println("Invalid type"+type);
		}
		if(validName && validPrice && validCompany && validSize && validType && validFlavour) {
			System.out.println("Pizza DTO is valid"+dto);
			return true;
		}
		System.out.println("Pizza is not valid"+dto);
		System.out.println(dto.toString());
		
		
		
		return false;
	}

	
}
