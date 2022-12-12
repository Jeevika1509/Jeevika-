package com.xworkz.copy.examples.boot;

import java.time.LocalDateTime;

import com.xworkz.copy.examples.dto.IplDTO;
import com.xworkz.copy.examples.repository.IplRepository;
import com.xworkz.copy.examples.repository.IplRepositoryImpl;

public class IplRunner {
	public static void main(String[] args) {

	IplRepository repository=new IplRepositoryImpl();
	IplDTO ipldto=new IplDTO();
	ipldto.setCaptainName("Faf du Plessis");
	ipldto.setAmount(85);
	ipldto.setOwnerAlive(true);
	ipldto.setWins(107);
	ipldto.setDefeats(113);
	ipldto.setCreatedBy("SYSTEM");
	ipldto.setCreatedDate(LocalDateTime.now());
	
	repository.create(ipldto);

	}

}
