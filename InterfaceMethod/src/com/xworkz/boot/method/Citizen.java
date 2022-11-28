package com.xworkz.boot.method;

public class Citizen implements RailwayRules {

	@Override
	public String name() 
	{
		System.out.println("name of train");
		return null;
	}

	@Override
	public int noOfPeople() 
	{
		System.out.println("noofpeople");
		return 0;
	}

	@Override
	public double ticketPrice()
	{
		System.out.println("ticketprice");
		return 0;
	}

	@Override
	public boolean seatno() 
	{
		System.out.println("seatno");
		return false;
	}

	@Override
	public String place()
	{
		System.out.println("place to go");
		return null;
	}
	
	public static void main(String[] args) {
		
		RailwayRules railwayRules=new Citizen();
		
		railwayRules.name();
		railwayRules.noOfPeople();
		railwayRules.seatno();
		railwayRules.place();
		railwayRules.ticketPrice();
		
		
	}
	

}
