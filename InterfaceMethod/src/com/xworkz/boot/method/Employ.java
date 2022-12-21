package com.xworkz;

public class Employ implements Person {

	@Override
	public double salary() 
	{
		System.out.println("salary of person");
		return 0;
	}

	@Override
	public String name()
	{
		System.out.println("name of person");
		return null;
	}

	@Override
	public float height() 
	{
		System.out.println("height of person");
		return 0;
	}

	@Override
	public int age() 
	{
		System.out.println("age of person");
		return 0;
	}

	@Override
	public String gender()
	{
		System.out.println("gender of person");
		return null;
	}
	
	
	public static void main(String[] args) {
		
	
	Person person=new Employ();
	
	person.salary();
	person.name();
	person.height();
	person.age();
	person.gender();
	}
	
	
}
