package com.xworkz.place.service;

import com.xworkz.place.dto.PlaceDTO;

import com.xworkz.place.exception.InvalidPlaceDataException;

public interface PlaceService {

	boolean validateAndSave(PlaceDTO dto) throws InvalidPlaceDataException;
}
