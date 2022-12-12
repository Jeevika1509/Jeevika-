package com.xworkz.copy.examples.repository;

import com.xworkz.copy.examples.dto.IplDTO;

public interface IplRepository {

	boolean create(IplDTO dto);
	default int total() {
		return 0;
	}
}
