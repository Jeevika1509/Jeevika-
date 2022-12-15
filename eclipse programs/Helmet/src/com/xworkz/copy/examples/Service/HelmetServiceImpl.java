package com.xworkz.copy.examples.Service;

import com.xworkz.copy.examples.Repository.HelmetRepository;
import com.xworkz.copy.examples.constant.Color;
import com.xworkz.copy.examples.constant.HelmetType;
import com.xworkz.copy.examples.dto.HelmetDTO;

public class HelmetServiceImpl implements HelmetService {

	private HelmetRepository helmetRepository;
	
	
	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		super();
		this.helmetRepository = helmetRepository;
	}


	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		String brand=dto.getBrand();
		HelmetType type=dto.getType();
		Double price=dto.getPrice();
		Color color=dto.getColor();
		boolean validBrand=false;
		boolean validType=false;
		boolean validPrice=false;
		boolean validColor=false;
		
		if(brand!=null && brand.length()>=4 && brand.length()<=10) {
			System.out.println("brand is valid"+brand);
			validBrand=true;
		}
		else {
			System.out.println("brand is invalid"+brand);
		}
		if(type!=null) {
			System.out.println("type is valid"+type);
			validPrice=true;
		}
		else {
			System.out.println("type is invalid"+type);
		}
		if(color!=null) {
			System.out.println("color is valid"+color);
			validColor=true;
		}
		else {
			System.out.println("color is invalid"+color);
		}
		if(price!=null && price>100 && price<10000) {
			System.out.println("price is valid"+price);
		}
		else {
			System.out.println("price is invalid"+price);
		}
		if(validBrand && validPrice && validColor && validType) {
			System.out.println("helmetDTO is valid,can save using repository");
			boolean saved=this.helmetRepository.save(dto);
			System.out.println("helmet dto is saved"+saved);
			return saved;
		}
		else {
			System.out.println("helmet DTO is invalid,cannot save using repository");
		}
		
		
		return false;
	}

	
}
