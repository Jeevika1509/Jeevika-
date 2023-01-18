package com.xworkz.soldier.repository;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepository{
	
	 
	 public SoldierRepoImpl() {
		System.out.println("created SoldierRepoImpl using no arg constructor");
	}
	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("running save");
		System.out.println("dto:"+dto);
		return false;
	}
	
	

}
