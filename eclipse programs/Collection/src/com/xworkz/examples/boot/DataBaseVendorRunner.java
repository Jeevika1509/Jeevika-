package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.examples.DTO.DataBaseVendorDTO;
import com.xworkz.examples.constants.Type;

public class DataBaseVendorRunner {

	public static void main(String[] args) {

		Collection<DataBaseVendorDTO> collection=new ArrayList<DataBaseVendorDTO>();
		collection.add(new DataBaseVendorDTO("Oracle", "Oracle", Type.RelationalDB, 150, 47500));
		collection.add(new DataBaseVendorDTO("DynamoDB", "Amazon", Type.NoSQL,400, 1470));
		collection.add(new DataBaseVendorDTO("MongoDB", "Dwight merriman", Type.Document, 16, 648));
		collection.add(new DataBaseVendorDTO("Azure SQL database", "Microsoft Azure",Type.RelationalDB, 30, 7200));
		collection.add(new DataBaseVendorDTO("IBM", "IBM",Type.SQL, 10, 80));
		
		collection.stream().map(dto->dto.getDevelopedBy().toUpperCase()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		collection.stream().filter(dto->dto.getLicenseCost()<100 && dto.getType()==Type.SQL).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		collection.stream().map(dto->dto.getType()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
	}

}
