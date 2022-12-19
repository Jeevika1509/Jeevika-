package com.xworkz.bakery.service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.exception.InvalidBakeryDataException;

public interface BakeryService {

	boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException;
}
