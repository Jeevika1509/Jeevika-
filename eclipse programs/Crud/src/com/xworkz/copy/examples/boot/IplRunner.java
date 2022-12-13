package com.xworkz.copy.examples.boot;

import java.time.LocalDateTime;

import com.xworkz.copy.examples.dto.IplDTO;
import com.xworkz.copy.examples.dto.constant.TeamName;
import com.xworkz.copy.examples.repository.IplRepository;
import com.xworkz.copy.examples.repository.IplRepositoryImpl;

public class IplRunner {
	public static void main(String[] args) {

		IplRepository repository = new IplRepositoryImpl();
		IplDTO ipldto = new IplDTO();
		ipldto.setCaptainName("Faf du Plessis");
		ipldto.setAmount(85);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(107);
		ipldto.setDefeats(113);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.RCB);
		repository.create(ipldto);
		
		ipldto.setCaptainName("Rohit Sharma");
		ipldto.setAmount(48);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(129);
		ipldto.setDefeats(98);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.MI);
		repository.create(ipldto);
		
		ipldto.setCaptainName("Dhoni");
		ipldto.setAmount(70);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(121);
		ipldto.setDefeats(86);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.CSK);
		repository.create(ipldto);
		
		ipldto.setCaptainName("Rishabh Pant");
		ipldto.setAmount(47);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(100);
		ipldto.setDefeats(118);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.DC);
		repository.create(ipldto);

		ipldto.setCaptainName("KL Rahul");
		ipldto.setAmount(59);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(9);
		ipldto.setDefeats(6);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.LSG);
		repository.create(ipldto);
		
		ipldto.setCaptainName("Mayank Agarwal");
		ipldto.setAmount(70);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(98);
		ipldto.setDefeats(116);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.KX1P);
		repository.create(ipldto);
		
		ipldto.setCaptainName("Kane Williamson");
		ipldto.setAmount(70);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(74);
		ipldto.setDefeats(74);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.SRH);
		repository.create(ipldto);
		
		ipldto.setCaptainName("Eoin Morgan");
		ipldto.setAmount(48);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(113);
		ipldto.setDefeats(106);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.KKR);
		repository.create(ipldto);
		
		ipldto.setCaptainName("Sanju Samson");
		ipldto.setAmount(70);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(94);
		ipldto.setDefeats(93);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.RR);
		repository.create(ipldto);
		
		ipldto.setCaptainName("Hardik Pandya");
		ipldto.setAmount(52);
		ipldto.setOwnerAlive(true);
		ipldto.setWins(12);
		ipldto.setDefeats(4);
		ipldto.setCreatedBy("SYSTEM");
		ipldto.setCreatedDate(LocalDateTime.now());
		ipldto.setTeamName(TeamName.GT);
		repository.create(ipldto);
		
		
	}

}
