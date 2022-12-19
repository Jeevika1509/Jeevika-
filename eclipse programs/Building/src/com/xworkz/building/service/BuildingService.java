package com.xworkz.building.service;

import com.xworkz.building.dto.BuildingDTO;
import com.xworkz.building.exception.InvalidBuildingDataException;

public interface BuildingService {

	boolean validateAndSave(BuildingDTO dto)throws InvalidBuildingDataException;
}
