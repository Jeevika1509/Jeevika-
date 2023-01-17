package com.xworkz.terroristExample.boot.dto.service;

import com.xworkz.terroristExample.boot.dto.TerroristDTO;

public interface TerroristService {

	boolean validateAndSave(TerroristDTO dto);
}
