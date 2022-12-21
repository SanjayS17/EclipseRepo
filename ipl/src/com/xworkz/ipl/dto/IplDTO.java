package com.xworkz.ipl.dto;

import java.time.LocalTime;

public class IplDTO extends AbstractAuditDTO {
	private String teamName;
	private String captainName;
	private boolean ownerName;
	private double purse;
	private int wins;
	private int defeats;
	
	
	public IplDTO() {
     System.out.println("calling noarg cons of ipl");
	}


	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", capitalName=" + captainName + ", ownerName=" + ownerName + ", purse="
				+ purse + ", wins=" + wins + ", defeats=" + defeats + "]";
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public boolean isOwnerName() {
		return ownerName;
	}


	public void setOwnerName(boolean ownerName) {
		this.ownerName = ownerName;
	}


	public double getPurse() {
		return purse;
	}


	public void setPurse(double purse) {
		this.purse = purse;
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


	public String getCapitalName() {
		return captainName;
	}


	public void setCapitalName(String capitalName) {
		this.captainName = captainName;
	}


	public void setCaptainName(String string) {
		// TODO Auto-generated method stub
		
	}


	public void setisOwnerAlive(boolean b) {
		// TODO Auto-generated method stub
		
	}


	public void setCreatedBy(LocalTime now) {
		// TODO Auto-generated method stub
		
	}


	
	

}
