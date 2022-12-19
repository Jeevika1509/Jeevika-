package com.xworkz.railwaystation.service;

import com.xworkz.railwaystation.dto.RailwayStationDTO;
import com.xworkz.railwaystation.exception.InvalidRailwayStationDataException;

public interface RailwayStationService {
	
	boolean validateAndSave(RailwayStationDTO dto) throws InvalidRailwayStationDataException;
	

}
