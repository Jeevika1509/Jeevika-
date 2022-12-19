package com.xworkz.theater.service;

import com.xworkz.theater.Exception.InvalidTheaterDataException;
import com.xworkz.theater.dto.TheaterDTO;

public interface TheaterService {

	boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException;
}
