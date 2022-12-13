package com.xworkz.copy.examples.dto;

import com.xworkz.copy.examples.dto.constant.TeamName;

public class IplDTO extends AbstractAuditDTO{
	private TeamName teamName;
	private String captainName;
	private boolean ownerAlive;
	private double amount;
	public int wins;
	public int defeats;
	
	public IplDTO() {
		System.out.println("running constructor with no arguments");
	}

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captainName=" + captainName + ", ownerAlive=" + ownerAlive
				+ ", amount=" + amount + ", wins=" + wins + ", defeats=" + defeats + "]";
	}

	public TeamName getTeamName() {
		return teamName;
	}

	public void setTeamName(TeamName teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public boolean isOwnerAlive() {
		return ownerAlive;
	}

	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	
	

}