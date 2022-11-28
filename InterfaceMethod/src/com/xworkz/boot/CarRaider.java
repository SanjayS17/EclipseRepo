package com.xworkz.boot;

public class CarRaider implements Car {

	@Override
	public int noOfSeat() 
	{ 
		System.out.println("noOfseats");
		return 0;
	}

	@Override
	public double price()
	{
		System.out.println("car price");
		return 0;
	}

	@Override
	public String color()
	{
		System.out.println("car color");
		return null;
	}

	@Override
	public String name()
	{
		System.out.println("name of car");
		return null;
	}

	@Override
	public String type() 
	{
		System.out.println("car type");
		return null;
	}
	public static void main(String[] args) {
		
	Car car=new CarRaider();
	
	car.color();
	car.name();
	car.noOfSeat();
	car.price();
	car.type();
	
	}
	
	

}
