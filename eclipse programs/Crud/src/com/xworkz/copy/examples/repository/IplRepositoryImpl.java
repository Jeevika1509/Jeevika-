package com.xworkz.copy.examples.repository;

import com.xworkz.copy.examples.Exception.IplDtoSizeExceededException;
import com.xworkz.copy.examples.dto.IplDTO;

public class IplRepositoryImpl implements IplRepository {

	private IplDTO[] iplDtos = new IplDTO[10];
	private int currentIndex = 0;

	public boolean create(IplDTO dto) {
		System.out.println("running create method of IplDTO" + dto);
		if (this.currentIndex >= this.iplDtos.length) {

			System.out.println("Size exceeded cannot add more iplteam");
			throw new IplDtoSizeExceededException();

		}
		this.iplDtos[this.currentIndex] = dto;
		System.out.println("saved" + dto + "in index" + this.currentIndex);
		this.currentIndex++;
		return true;

	}

}
